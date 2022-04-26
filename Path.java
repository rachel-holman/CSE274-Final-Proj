
public class Path implements Comparable<Path> {
  private char vertex;
  private String path;
  private int cost;
  
  public Path(String vertex, int cost, String pathStr) {
    this.vertex = vertex;
    this.cost = cost;
    this.pathStr = pathStr;
  }
  
  public int compareTo(Path other) {
    return cost - other.cost;    // lower cost goes first
  }
}
