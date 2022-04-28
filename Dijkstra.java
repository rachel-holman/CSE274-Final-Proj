
public class Dijkstra {
	
	private statiic int totalCost;
	
	// definitely not confident that this method actually works
	public static Path shortestPath(Graph graph, Vertex start, Vertex end) {

		PriorityQueue<Path> pq = new PriorityQueue<Path>();
		pq.add(new Path(start, 0, start));
		ArrayList<String> visited = new ArrayList<String>();
		
		while(!pq.isEmpty()) {
			Path nextEntry = pq.remove();
			if(nextEntry.getVertex().equals(end)) {
				return nextEntry;
			} else if(visited.contains(nextEntry.getVertex()) {
			   continue;
			} else {
				currVertex = nextEntry.getVertex();
				currCost = nextEntry.getCost();
				currPath = nextEntry.getPathStr();
				visited.add(currVertex);
				for(Edge e : graph.getGraph().get(currVertex)) {
					String dest = e.getToVertex();
					if(!(visited.contains(dest))) {
						nextCost = currCost + (useDistCost ? e.getDistanceCost() : e.getTimeCost());
						nextPath = currPath + dest;
						pq.add(new Path(dest, nextCost, nextPath));
					}
				}		
			}  
		}
		
		return null;
	}
  
}
