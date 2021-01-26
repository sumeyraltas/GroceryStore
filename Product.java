public class Product {

	public static int productNo = 0;
	private int productNumber;
	private String name;
	private String type;
	private int cost;
	
	public Product(int productNo, String name, String type, int cost) {
		
		Product.productNo = productNo + 1;
		this.productNumber = productNo + 1;
		this.name = name;
		this.type = type;
		this.cost = cost;
	}
	public String toString() {
		return "Product #" +productNumber+ ": " +name+ " (" +type+ ") " +cost+ "$";
	}
	public int getProductNo() {
		return productNumber;
	}
	public void setProductNo(int productNo) {
		productNumber = productNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public  int getCost() {
		return cost;
	}
	public  void setCost(int cost) {
		this.cost = cost;
	}
}
