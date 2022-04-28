
public class Tester {
	public static void main(String[] args) {
//		new Window_GPS(new Graph("MapInformationXY.txt"));
		Graph g = new Graph("MapInformation.txt");
		// System.out.println(g);
		System.out.println(Dijkstra.shortestPath(g, g.getVertex("A"), g.getVertex("B")));
	}
}
