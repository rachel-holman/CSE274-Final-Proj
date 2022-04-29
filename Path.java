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
			ret += e.getFromVertex().getSymbol() + " -> " + e.getToVertex().getSymbol();
			ret += "\t(" + (Graph.useDistCost ? e.getDistanceCost() + " miles)" : e.getTimeCost() + " minutes)");
			ret += "\n";
		}
		ret += "Total"+ (Graph.useDistCost ? " distance" : " time") +" cost: " + getCost() + (Graph.useDistCost ? " miles" : " minutes");
		return ret;
	}

	private String addressToString() {
		String ret = "";
		for(Edge e : edges) {
			ret += String.format("%-35s", e.getFromVertex().getAddress() + " -> " + e.getToVertex().getAddress());
			ret += "\t(" + (Graph.useDistCost ? e.getDistanceCost() + " miles)" : e.getTimeCost() + " minutes)");
			ret += "\n";
		}
		ret += "Total"+ (Graph.useDistCost ? " distance" : " time") +" cost: " + getCost() + (Graph.useDistCost ? " miles" : " minutes");
		return ret;
	}

}

