public class Mult extends Binop {
	public Mult() {
    	super();
    }
	public Mult(Node l, Node r) {
		super(l, r);
	}
	public double eval() {
		return lChild.eval() * rChild.eval();
	}
	public String toString() {
		return "(" + lChild.toString() + " * " + rChild.toString() + ")";
	}
	
	 public double eval(double [] data) {
	        return lChild.eval(data) * rChild.eval(data);
	 }
}