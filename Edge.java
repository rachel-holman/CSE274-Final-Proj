
public class Edge {
  private Vertex fromVertex, toVertex;
  private int timeCost, distanceCost;
  
  public Edge(String line, Graph graph) {   // honestly don't know how I feel about this constructor (mainly the getVertex method in the Graph class)
    String parts = line.split("\t");
    this.fromVertex = graph.getVertex(parts[0]);
    this.toVertex = graph.getVertex(parts[1]);
    this.timeCost = Integer.parseInt(parts[2]);
    this.distanceCost = Integer.parseInt(parts[3]);
  }
  
  public Vertex getFromVertex() {
    return this.fromVertex; 
  }
  
  public Vertex getToVertex() {
    return this.toVertex; 
  }
  
  public Vertex getTimeCost() {
    return this.timeCost; 
  }
  
  public Vertex getDistanceCost() {
    return this.distanceCost; 
  }
}
