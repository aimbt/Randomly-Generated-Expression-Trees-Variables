
import java.util.*;

public class TerminalFactory {
	private int nIdV;
	public TerminalFactory(int n) {
		nIdV = n;
	}
	public Node getTerminal(Random r) {
		int i = r.nextInt(nIdV+1);

		Node o;

		if (i < nIdV) {

			o = new Variable(i);
		} else
			o = new Const(r.nextDouble());

		return o;
	}
	public int getNumIndepVars() {
		return nIdV;
	}
}