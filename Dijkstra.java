import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Dijkstra {

	private static int totalCost;

	// definitely not confident that this method actually works
	public static Path shortestPath(Graph graph, Vertex start, Vertex end) {
		
		PriorityQueue<Path> pq = new PriorityQueue<Path>();
		totalCost = 0;
		pq.add(new Path(start, totalCost, new LinkedList<Edge>()));
		ArrayList<Vertex> visited = new ArrayList<Vertex>();

		while(!pq.isEmpty()) {
			Path nextEntry = pq.remove();
			totalCost = nextEntry.getCost();
			
			if(nextEntry.getVertex() == end)
				return nextEntry;
			
			if(visited.contains(nextEntry.getVertex())) {
				continue;
			} else {
				Vertex currVertex = nextEntry.getVertex();
				for(Edge e : graph.getGraph().get(currVertex)) {
					if(!visited.contains(e.getToVertex())) {
						LinkedList<Edge> newEdges = new LinkedList<Edge>(nextEntry.getEdges());
						newEdges.add(e);
						int newCost = totalCost + (Graph.useDistCost ? e.getDistanceCost() : e.getTimeCost());
						pq.add(new Path(graph.getVertex(e.getToVertex().getSymbol()), newCost, newEdges));
					}
				}
			}
			
			visited.add(nextEntry.getVertex());
		}

		return null;
	}

}
