import java.util.Random;

public class Const extends Node {
	public double value;
	
	public Const(double d) {
		value = d;
	}
	public Const() {
		value = 0;
	}
	public double eval() {
		return value;
	}
	public String toString(){
		return value+"";
		
	}
	public void addRandomKids(OperatorFactory o, TerminalFactory t,
			int maxDepth, Random r) {
		
	}
	public double eval(double [] data) { 
		return value; 
	
	}
	public int mySize() {
		return depth;
	}
}