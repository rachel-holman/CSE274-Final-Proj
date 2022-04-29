
public class Tester {
	public static void main(String[] args) {
		Graph g = new Graph("MapInformation.txt");
		// System.out.println(g);
		System.out.println(Dijkstra.shortestPath(g, g.getVertex("Q"), g.getVertex("D")));
		System.out.println();
		Graph.useDistCost = true;
		System.out.println(Dijkstra.shortestPath(g, g.getVertex("Q"), g.getVertex("D")));
		System.out.println();
		
		Graph.returnAddress = true;
		Graph.useDistCost = false;
		System.out.println(Dijkstra.shortestPath(g, g.getVertex("Q"), g.getVertex("D")));
		System.out.println();
		Graph.useDistCost = true;
		System.out.println(Dijkstra.shortestPath(g, g.getVertex("Q"), g.getVertex("D")));
		System.out.println();
	}
}
