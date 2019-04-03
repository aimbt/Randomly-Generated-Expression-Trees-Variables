public class Divide extends Binop {
	public Divide() {
    	super();
    }
	
	public Divide(Node l, Node r) {
		super(l, r);
	}
	public double eval() {
		return lChild.eval() / rChild.eval();
	}	
	public String toString() {
		return "(" + lChild.toString() + " / " + rChild.toString() + ")";
	}
	
	 public double eval(double [] data) {
	    	if (rChild.eval(data) == 0 ){
	    	System.out.println("Error");
	    	}
	    	return lChild.eval(data) / rChild.eval(data);
	 }
}