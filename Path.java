import java.util.LinkedList;

public class Path implements Comparable<Path> {
	private Vertex vertex;
	private int cost;
	private LinkedList<Edge> edges;

	public Path(Vertex vertex, int cost, LinkedList<Edge> edges) {
		this.vertex = vertex;
		this.cost = cost;
		this.edges = edges;
	}

	public int compareTo(Path other) {
		return cost - other.cost;    // lower cost goes first
	}

	public Vertex getVertex() {
		return this.vertex; 
	}

	public LinkedList<Edge> getEdges() {
		return this.edges; 
	}

	public int getCost() {
		return this.cost; 
	}
	
	@Override
	public String toString() {
		if(Graph.returnAddress) return addressToString();
		String ret = "";
		for(Edge e : edges) {
			ret += e.getFromVertex().getSymbol() + "->" + e.getToVertex().getSymbol();
			ret += "\tCost: " + (Graph.useDistCost ? e.getDistanceCost() + " miles" : e.getTimeCost() + " min");
			ret += "\n";
		}
		ret += "\tTotal cost: " + getCost() + (Graph.useDistCost ? " miles" : " min");
		return ret;
	}

	private String addressToString() {
		String ret = "";
		for(Edge e : edges) {
			ret += e.getFromVertex().getAddress() + "->" + e.getToVertex().getAddress();
			ret += "\tCost: " + (Graph.useDistCost ? e.getDistanceCost() + " miles" : e.getTimeCost() + " min");
		}
		ret += "\tTotal cost: " + getCost() + (Graph.useDistCost ? " miles" : " min");
		return ret;
	}

}
