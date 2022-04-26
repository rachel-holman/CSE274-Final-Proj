
public class Edge {
  private Vertex fromVertex, toVertex;
  private int timeCost, distanceCost;
  
  public Edge(String line) {
    String parts = line.split("\t");
    // how to get access to vertices?
    this.timeCost = Integer.parseInt(parts[2]);
    this.distanceCost = Integer.parseInt(parts[3]);
  }
}
