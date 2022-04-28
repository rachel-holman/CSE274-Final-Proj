
public class Vertex {
  private String symbol;
  private String address;
  // private int x, y;
  
  public Vertex(String symbol, String address) {
		this.symbol = symbol;
		this.address = address;
	}
  
  public String getSymbol() {
    return this.symbol; 
  }
  
  public String getAddress() {
    return this.address; 
  }
}
