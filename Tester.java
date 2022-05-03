/**
 * 
 * @author Rachel Holman, Ryan Yu, Ben Collinson
 * @description: CSE 247 Final Project to create a program similar to a GPS system
 * 
 */

public class Tester {
	
	public static void main(String[] args) {

		Graph g = new Graph("MapInformation.txt");

//		System.out.println(Dijkstra.shortestPath(g, g.getVertex("A"), g.getVertex("B")));
//		System.out.println();
		
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
