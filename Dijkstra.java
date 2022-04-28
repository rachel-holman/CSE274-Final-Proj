import java.util.ArrayList;
import java.util.PriorityQueue;

public class Dijkstra {

	private static int totalCost;

	// definitely not confident that this method actually works
	public static Path shortestPath(Graph graph, Vertex start, Vertex end) {

		PriorityQueue<Path> pq = new PriorityQueue<Path>();
		pq.add(new Path(start.getSymbol(), 0, start.getSymbol()));
		ArrayList<String> visited = new ArrayList<String>();

		while(!pq.isEmpty()) {
			Path nextEntry = pq.remove();
			if(nextEntry.getVertex().equals(end)) {
				return nextEntry;
			} else if(visited.contains(nextEntry.getVertex())) {
				continue;
			} else {
				String currVertex = nextEntry.getVertex();
				int currCost = nextEntry.getCost();
				String currPath = nextEntry.getPathStr();
				visited.add(currVertex);
				for(Edge e : graph.getGraph().get(currVertex)) {
					String dest = e.getToVertex().getSymbol();
					if(!(visited.contains(dest))) {
						int nextCost = currCost + (Graph.useDistCost ? e.getDistanceCost() : e.getTimeCost());
						String nextPath = currPath + dest;
						pq.add(new Path(dest, nextCost, nextPath));
					}
				}		
			}  
		}

		return null;
	}

}
