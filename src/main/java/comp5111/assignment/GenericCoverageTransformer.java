package comp5111.assignment;

import java.util.Iterator;
import java.util.Map;

import soot.*;
import soot.jimple.*;
import soot.util.*;

public class GenericCoverageTransformer<T> extends BodyTransformer {
	@FunctionalInterface
	public interface Visitor<T> {
		void method(GenericCoverageTransformer<T> transformer, Chain units, Stmt stmt, String classname);
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
		String classname = method.getDeclaringClass().getName();
		Chain units = b.getUnits();
		Iterator<Stmt> stmts = units.snapshotIterator();
		while (stmts.hasNext()) {
			Stmt stmt = (Stmt)stmts.next();
			visitor.method(this, units, stmt, classname);
		}
	}

}
