public class Grocery implements StockInterface {
	
	private Product product;
	private int price;
	private int amount;

	public Grocery(Product product, int price, int amount) {
	
		this.product = product;
		this.price = price;
		this.amount = amount;
		
		   if (amount < product.getCost()){
           	System.out.println("Warning, sale price is lower than product cost");
           }
		   
	}
	
	public String toString() {
		return "Product #" + product.getProductNo()+ ": " +product.getName()+ " (" +product.getType()+ ") " +product.getCost()+ "$ , selling at "+amount+"$ with "+price+" left";
	}

	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public void setStockAmount(int newAmount) {
	}
	@Override
	public void setStockPrice(int newPrice) {
	}
	@Override
	public int getStockAmount() {
		return 0;
	}
	@Override
	public int getStockPrice() {
		return 0;
	}
}
