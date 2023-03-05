package session44;

import java.util.HashSet;

public class graphclient {

	public static void main(String[] args) {
		graph g = new graph(7);
		g.addedge(1, 2, 10);
		g.addedge(3, 5, 90);
		g.addedge(2, 5, 80);
		g.display();
		System.out.println(g.haspath(1, 3, new HashSet()));
		g.printallpath(3, 1, new HashSet<Integer>(), "");

	}

}
