package comp5111.assignment;

import java.util.Iterator;
import java.util.Map;

import soot.*;
import soot.jimple.*;
import soot.util.*;

public class GenericCoverageTransformer<T> extends BodyTransformer {
    @FunctionalInterface
    public interface Visitor<T> {
        // actually the method should not be this complicated
        // but there are limitations in lambda expression for java...
        int method(GenericCoverageTransformer<T> transformer, Chain units, Stmt stmt, SootMethod method, int index);
    }

    static {
        Scene.v().setSootClassPath(null);
    }

    private Visitor visitor;
    public T data;
    public int total = 0;

    public GenericCoverageTransformer(Visitor visitor, T data) {
        this.visitor = visitor;
        this.data = data;
    }

    @Override
    protected void internalTransform(Body b, String phaseName, Map<String, String> options) {
        SootMethod method = b.getMethod();
        Chain units = b.getUnits();
        Iterator<Stmt> stmts = units.snapshotIterator();
        int i = 0;
        while (stmts.hasNext()) {
            Stmt stmt = (Stmt) stmts.next();
            // this i is just an index within the method
            i = visitor.method(this, units, stmt, method, i);
        }
    }

}
