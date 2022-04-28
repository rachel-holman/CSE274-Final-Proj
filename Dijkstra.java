
public class Dijkstra {
	
	private statiic int totalCost;
	
	public static Path shortestPath(Graph graph, Vertex start, Vertex end) {

		PriorityQueue<Path> pq = new PriorityQueue<Path>();
		pq.add(new Path(start, 0, start));
		ArrayList<String> visited = new ArrayList<String>();
		
		while(!pq.isEmpty()) {
			Path nextEntry = pq.remove();
			if(visited.contains(nextEntry.getVertex()) {
			   continue;
			} else {
				for(Edge e : graph.getGraph().get(nextEntry.getVertex()))
					if(!(visited.contains(e.getToVertex())))
						
			}
			   
		}
		
		return pq.peek();
	}
  
}
