import java.util.Random;

public abstract class Node  implements Cloneable{

	int depth;

	public abstract double eval(double[] data);

	public abstract void addRandomKids(OperatorFactory o, TerminalFactory t, int maxDepth, Random r);
	public abstract int mySize();
	
    public Node() {
    	
    }
    public double eval() {
        System.out.println("Error: eval Node");
        return 0;
    }
    
    public Object clone() {
		Object o = null;

		try {
			o = super.clone();
		} 

		catch (CloneNotSupportedException e) {
			System.out.println("Node can't be cloned");
		}
		return o;
	}
    

}
