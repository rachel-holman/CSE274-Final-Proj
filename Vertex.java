
public class Vertex {
  private String symbol;
  private String address;
  // private int x, y;
  
  public Vertex(String line) {
    String[] parts = line.split("\t");
    this.symbol = parts[0];
    this.address = parts[1];
  }
}
