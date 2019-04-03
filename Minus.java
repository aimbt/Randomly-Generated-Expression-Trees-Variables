public class Minus extends Binop {
	public Minus() {
    	super();
    }
	public Minus(Node l, Node r) {
		super(l, r);
	}
	public double eval() {
		return lChild.eval() - rChild.eval();
	}
	public String toString() {
		return "(" + lChild.toString() + " - " + rChild.toString() + ")";
	}
	 public double eval(double [] data) {
	        return lChild.eval(data) - rChild.eval(data);
	 }
}