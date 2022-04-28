
public class Edge {
	private Vertex fromVertex, toVertex;
	private int timeCost, distanceCost;

	public Edge(Vertex fromVertex, Vertex toVertex, int timeCost, int distanceCost) {
		this.fromVertex = fromVertex;
		this.toVertex = toVertex;
		this.timeCost = timeCost;
		this.distanceCost = distanceCost;
	}

	public Vertex getFromVertex() {
		return this.fromVertex; 
	}

	public Vertex getToVertex() {
		return this.toVertex; 
	}

	public int getTimeCost() {
		return this.timeCost; 
	}

	public int getDistanceCost() {
		return this.distanceCost; 
	}
}
