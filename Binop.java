import java.util.Random;

public class Binop extends Node {
	
	public Node lChild, rChild;
	public Binop() {
		depth = 0;
		lChild = null;
		rChild = null;
	}
	public Binop(Node l, Node r) {
		lChild = l;
		rChild = r;
	}
	
	public void addRandomKids(OperatorFactory o, TerminalFactory t, int maxDepth, Random rand) {
		if (depth < maxDepth - 1) {
			int m = rand.nextInt(o.getNumOps() + t.getNumIndepVars()); 
			if (m < o.getNumOps()) {
				setChild(o.getOperator(rand), 1);
				lChild.addRandomKids(o, t, maxDepth, rand);
			} 
			else {
				setChild(t.getTerminal(rand), 1);
			}
			m = rand.nextInt(o.getNumOps() + t.getNumIndepVars()); 
			if (m < o.getNumOps()) {
				setChild(o.getOperator(rand), 2);
				rChild.addRandomKids(o, t, maxDepth, rand);
			} 
			else {
				setChild(t.getTerminal(rand), 2);
			}
		}
		else {
			setChild(t.getTerminal(rand), 1);
			setChild(t.getTerminal(rand), 2);
		}

	}
	public void setChild(Node n, int p) { 
		if (p == 1) {
			lChild = n;
			lChild.depth = depth + 1;
		}
		if (p == 2) {
			rChild = n;
			rChild.depth = depth + 1;
		}
	}
    
	public double eval(double[] data) {
		return 0;
	}


	public int mySize() {
		return depth;
		
	}
}