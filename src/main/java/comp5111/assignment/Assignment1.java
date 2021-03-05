package comp5111.assignment;

import java.util.Arrays;
import java.util.HashMap;
import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

import soot.*;
import soot.jimple.IntConstant;
import soot.jimple.InvokeExpr;
import soot.jimple.Jimple;
import soot.jimple.Stmt;
import soot.jimple.internal.JIdentityStmt;
import soot.jimple.internal.JIfStmt;
import soot.options.Options;

import org.junit.runner.JUnitCore;

public class Assignment1 {
    public static void main(String[] args) {

        /* check the arguments */
        if (args.length <= 1 || (args[0].compareTo("0") != 0 &&
        						 args[0].compareTo("1") != 0 && 
        						 args[0].compareTo("2") != 0)) {
            System.err.println("Usage: java Assignment1 [coverage level] classnames ...");
            System.err.println("Usage: [coverage level] = 0 for statement coverage");
            System.err.println("Usage: [coverage level] = 1 for branch coverage");
            System.err.println("Usage: [coverage level] = 2 for line coverage");
            System.exit(0);
        }

        // these args will be passed into soot.
        String[] classNames = Arrays.copyOfRange(args, 1, args.length);
        Options.v().set_soot_classpath(Scene.v().defaultClassPath() + File.pathSeparator + "./bin");
		Options.v().set_validate(true);
		Options.v().set_keep_line_number(true);

        SootClass coverageClass;
    	SootMethod cover;
    	coverageClass = Scene.v().loadClassAndSupport("comp5111.assignment.CoverageChecker");
		cover = coverageClass.getMethod("void cover(int)");
		
		Pack jtp = PackManager.v().getPack("jtp");
		GenericCoverageTransformer<HashMap<String, ArrayList<Integer>>> transformer = null;
        if (args[0].compareTo("0") == 0) {
        	System.out.println("Checking instruction coverage...");
        	transformer = new GenericCoverageTransformer<HashMap<String, ArrayList<Integer>>>
        	((t, units, stmt, method, i) -> {
        		if (stmt instanceof JIdentityStmt) {
    				return i;
    			}
        		String name = method.getSignature();
    			int index;
    			synchronized (t) {
    				GenericCoverageTransformer<HashMap<String, ArrayList<Integer>>> tt = 
    						(GenericCoverageTransformer<HashMap<String, ArrayList<Integer>>>)t;
    				if (!tt.data.containsKey(name))
    					tt.data.put(name, new ArrayList<Integer>());
    				ArrayList<Integer> instMap = tt.data.get(name);
    				for (int j = instMap.size(); j <= i; j++)
    					instMap.add(-1);
    				index = t.total++;
    				instMap.set(i, index);
    			};
    			InvokeExpr expr = Jimple.v().newStaticInvokeExpr(
    					cover.makeRef(), IntConstant.v(index));
    			Stmt incStmt = Jimple.v().newInvokeStmt(expr);
    			units.insertBefore(incStmt, stmt);
    			return i + 1;
			}, new HashMap<String, ArrayList<Integer>>());
        } else if (args[0].compareTo("1") == 0) {
        	System.out.println("Checking branch coverage...");
        	transformer = new GenericCoverageTransformer<HashMap<String, ArrayList<Integer>>>
        	((t, units, stmt, method, i) -> {
				GenericCoverageTransformer<HashMap<String, ArrayList<Integer>>> tt = 
						(GenericCoverageTransformer<HashMap<String, ArrayList<Integer>>>)t;
        		String name = method.getSignature();
        		synchronized (t) {
        			if (!tt.data.containsKey(name))
    					tt.data.put(name, new ArrayList<Integer>());
        		}
				if (stmt instanceof JIfStmt) {
					JIfStmt ifstmt = (JIfStmt)stmt;
					int index, index2;
					synchronized (t) {
						index = t.total;
						t.total += 2;
	    				ArrayList<Integer> instMap = tt.data.get(name);
	    				for (int j = instMap.size(); j <= i + 1; j++)
	    					instMap.add(-1);
	    				instMap.set(i, index);
	    				instMap.set(i + 1, index + 1);
					};
					index2 = index + 1;
							
					InvokeExpr expr = Jimple.v().newStaticInvokeExpr(
							cover.makeRef(), IntConstant.v(index));
					Stmt incStmt = Jimple.v().newInvokeStmt(expr);
					units.insertAfter(incStmt, stmt);
		
					InvokeExpr expr2 = Jimple.v().newStaticInvokeExpr(
							cover.makeRef(), IntConstant.v(index2));
					Stmt incStmt2 = Jimple.v().newInvokeStmt(expr2);
					units.insertAfter(incStmt2, ifstmt.getTarget());
					return i + 2;
				}
				return i;
			}, new HashMap<String, ArrayList<Integer>>());
        } else if (args[0].compareTo("2") == 0) {
        	System.out.println("Checking line coverage...");
        	transformer = new GenericCoverageTransformer<HashMap<String, ArrayList<Integer>>>
        		((t, units, stmt, method, i) -> {
	        		int lineNum = stmt.getJavaSourceStartLineNumber();
	        		String name = method.getSignature();
	        		if (lineNum == -1)
	        			return i;
	    			int index;
	    			synchronized (t) {
	    				GenericCoverageTransformer<HashMap<String, ArrayList<Integer>>> tt = 
	    						(GenericCoverageTransformer<HashMap<String, ArrayList<Integer>>>)t;
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
	    			};
	    			InvokeExpr expr = Jimple.v().newStaticInvokeExpr(
	    					cover.makeRef(), IntConstant.v(index));
	    			Stmt incStmt = Jimple.v().newInvokeStmt(expr);
	    			units.insertBefore(incStmt, stmt);
	    			return i;
        		}, new HashMap<String, ArrayList<Integer>>());
        }
        jtp.add(new Transform("jtp.instrumeneter", transformer));
    	soot.Main.main(classNames);
        int total = transformer.total;
        try {
		    URL[] urls = new URL[]{
		    	new File("./sootOutput/").toURI().toURL(),
		    	new File("./target/test-classes/").toURI().toURL(),
		    };
		    // Create a new class loader with the directory
		    ClassLoader cl = new URLClassLoader(urls);
		    Class<?> cls = cl.loadClass("comp5111.assignment.cut.RegressionTest");
		    JUnitCore.runClasses(cls);
		    
		    CoverageReporter reporter = new CoverageReporter(transformer.data, classNames);
		    try (FileWriter reportFile = new FileWriter("report.json")) {
		    	reporter.report(reportFile);
		    } catch (IOException e) {
		    	e.printStackTrace();
		    }
		    //CoverageChecker.report(total);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
    }
}
