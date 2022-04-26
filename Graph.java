
public class Graph {
	
	private HashMap<Vertex, TreeSet<Edge>> graph;
	public static boolean useDistCost;
	public static boolean returnAddress;

	public Graph(String filename) {
		Scanner readFile = new Scanner(filename);
		readFile.nextLine();
		readFile.nextLine();	// skip first two rows in the file
		String line = readFile.nextLine();
		while(!(line.equals("<\Nodes">")) {
		    	graph.put(new Vertex(line), new TreeSet<Edge>());	// not sure if the the set should contain edges or not
			String line = readFile.nextLine();
		}
	    	
	}
	
	@Override
	public String toString() {
		String ret = "";
		return ret;
		
	}
				    
    	public static Vertex getVertex(String symbol) {
		for(Vertex v : graph.keySet())
			if(v.getSymbol().equals(symbol)) return v;
		return null;
	}
  
}
