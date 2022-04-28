
public class Path implements Comparable<Path> {
  private String vertex;
  private String pathStr;
  private int cost;
  
  public Path(String vertex, int cost, String pathStr) {
    this.vertex = vertex;
    this.cost = cost;
    this.pathStr = pathStr;
  }
  
  public int compareTo(Path other) {
    return cost - other.cost;    // lower cost goes first
  }
  
  public String getVertex() {
    return this.vertex; 
  }
  
  public String getPathStr() {
    return this.pathStr; 
  }
  
  public int getCost() {
    return this.cost; 
  }
}
