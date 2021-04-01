package comp5111.assignment;

import java.util.Arrays;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertFalse;

import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

import org.junit.runner.JUnitCore;
import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

import soot.*;
import soot.jimple.IntConstant;
import soot.jimple.InvokeExpr;
import soot.jimple.Jimple;
import soot.jimple.Stmt;
import soot.options.Options;

public class Assignment2 {
    public static void main(String[] args) throws IOException {
        String reportName = args[0];
        String testClassName = args[1];
        String[] classNames = Arrays.copyOfRange(args, 2, args.length);
        final List<String> lines = Files.readAllLines(Path.of("./src/main/java/comp5111/assignment/cut/ToolBox.java"));

        System.out.println("test class: " + testClassName);
        Options.v().set_soot_classpath(
                Scene.v().defaultClassPath() + File.pathSeparator + "bin");
        Options.v().set_validate(true);
        Options.v().set_keep_line_number(true);

        SootClass coverageClass = Scene.v().loadClassAndSupport("comp5111.assignment.CoverageChecker");
        SootMethod cover = coverageClass.getMethod("void cover(int)");
        Pack jtp = PackManager.v().getPack("jtp");
        GenericCoverageTransformer<HashMap<String, ArrayList<Integer>>> transformer;
        transformer = new GenericCoverageTransformer<HashMap<String, ArrayList<Integer>>>(
                (t, units, stmt, method, i) -> {
                    int lineNum = stmt.getJavaSourceStartLineNumber();
                    String name = method.getSignature();
                    if (lineNum == -1)
                        return i;
                    int index;
                    synchronized (t) {
                        // similarly, get an index and store it in a mapping from line number to ID
                        GenericCoverageTransformer<HashMap<String, ArrayList<Integer>>> tt;
                        tt = (GenericCoverageTransformer<HashMap<String, ArrayList<Integer>>>) t;
                        if (!tt.data.containsKey(name))
                            tt.data.put(name, new ArrayList<Integer>());
                        ArrayList<Integer> lineMap = tt.data.get(name);
                        for (int j = lineMap.size(); j <= lineNum; j++)
                            lineMap.add(-1);
                        index = lineMap.get(lineNum);
                        if (index == -1) {
                            index = t.total++;
                            lineMap.set(lineNum, index);
                        }
                    }
                    ;
                    InvokeExpr expr = Jimple.v().newStaticInvokeExpr(cover.makeRef(), IntConstant.v(index));
                    Stmt incStmt = Jimple.v().newInvokeStmt(expr);
                    units.insertBefore(incStmt, stmt);
                    return i;
                }, new HashMap<String, ArrayList<Integer>>());
        jtp.add(new Transform("jtp.instrumenter", transformer));
        soot.Main.main(classNames);
        try {
            URL[] urls = new URL[] {
                new File("./sootOutput/").toURI().toURL(),
                new File("./target/test-classes/").toURI().toURL()
            };
            // Create a new class loader with the directory
            ClassLoader cl = new URLClassLoader(urls);
            Class<?> cls = cl.loadClass(testClassName);
            CoverageStats stats = new CoverageStats();
            JUnitCore junit = new JUnitCore();
            junit.addListener(new RunListener() {
                public void testAssumptionFailure(Failure failure) {
                    System.out.println("failed");
                    System.out.println(failure.getDescription());
                }

                public void testFailure(Failure failure) {
                    try {
                        stats.calCoverage(false, transformer.data);
                        CoverageChecker.reset();
                    } catch (Exception e){
                        e.printStackTrace();
                        System.exit(-1);
                    }
                }

                public void testFinished(Description description) {
                    try {
                        stats.calCoverage(true, transformer.data);
                        CoverageChecker.reset();
                    } catch (Exception e){
                        e.printStackTrace();
                        System.exit(-1);
                    }
                }

                public void testRunFinished(Result result) {
                    try (FileWriter writer = new FileWriter(reportName)) {
                        int failures = result.getFailureCount();
                        int successes = result.getRunCount() - failures;
                        stats.report(successes, failures, lines, writer);
                        System.out.println("successes: " + successes);
                        System.out.println("failures: " + failures);
                    } catch (Exception e) {
                        e.printStackTrace();
                        System.exit(-1);
                    }
                }
            });
            junit.run(cls);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
