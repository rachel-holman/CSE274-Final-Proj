import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Dijkstra {

	private static int totalCost;

	public static Path shortestPath(Graph graph, Vertex start, Vertex end) {
		
		PriorityQueue<Path> pq = new PriorityQueue<Path>();
		totalCost = 0;
		pq.add(new Path(start, totalCost, new LinkedList<Edge>()));
		ArrayList<Vertex> visited = new ArrayList<Vertex>();

		while(!pq.isEmpty()) {
			
			// get highest priority path and cost
			Path nextEntry = pq.remove();
			totalCost = nextEntry.getCost();
			
			// if we are at the ending vertex, end and return
			if(nextEntry.getVertex() == end)
				return nextEntry;
			
			// if the vertex has already been visited before, continue
			if(visited.contains(nextEntry.getVertex())) {
				continue;
			} else {
				// for each unvisited vertex, make new path and add it the the priority queue
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
			
			// add the current vertex to the list of visited vertices
			visited.add(nextEntry.getVertex());
		}

		// if no path is found, return null
		return null;
	}

} 
