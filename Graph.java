
public class Graph {
	
	private HashMap<Vertex, TreeSet> graph;
	public static boolean useDiseCo	st;
	public static boolean returnAddress;

	public Graph(String filename) {
		Scanner readFile = new Scanner(filename);
		readFile.nextLine();
		readFile.nextLine();	// skip first two rows in the file
		String line = readFile.nextLine();
		while(!(line.equals("<\Node">")) {
		    	graph.put(new Vertex(line), new TreeSet<Edge>());	// not sure if the the set should contain edges or not
			String line = readFile.nextLine();
		}
	    	
   		// add new while loop for adding edges to TreeSet
	}
	
	@Override
	public String toString() {
		String ret = "";
		return ret;
		
	}
  
}
