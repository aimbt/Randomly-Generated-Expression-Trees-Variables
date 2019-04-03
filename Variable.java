import java.util.Random;

public class Variable extends Node {

	int idx;

	public Variable(int i) {
		idx = i;
	}
	public double eval(double[] data) {
		return data[idx];
	}
    
	public String toString() {
		String s = "X" + idx;
		return s;
	}

	public void addRandomKids(OperatorFactory o, TerminalFactory t,int maxDepth, Random rand) {
	}
	
	public int mySize() {

		return depth ;
	}
}