import java.util.ArrayList;
import java.util.Scanner;

public class InventoryProgram {

	public static void main(String[] args) {
	
		ArrayList<Product> list = new ArrayList<Product>();
		ArrayList<Grocery> list2 = new ArrayList<Grocery>();
		
		Scanner scan = new Scanner(System.in);

		String command = scan.next();
		
		int productNo = 0;
		String productName = "";
		String productType = "";
		int Cost = 0; 

		while (!command.equals("q")) {
	
			switch (command) {
				case "np":
					productNo = Product.productNo;
					productName = scan.next();
					productType = scan.next();
					Cost = scan.nextInt(); 
					
					Product product1 = new Product (productNo, productName, productType, Cost);
					System.out.println("Created " + product1.toString());
					
					list.add(product1);
					
					break;
								
				case "ns":
					int stockItem = scan.nextInt();
					int price = scan.nextInt();
					int amount = scan.nextInt();
					
					Grocery grocery = new Grocery (list.get(stockItem-1), price, amount);
//					int oldPrice = list.get(stockItem-1).getCost();
//		            if (amount < oldPrice){
//		            	System.out.println("Warning, sale price is lower than product cost");
//		            }
		      
		            System.out.println("Now selling "+ list.get(stockItem-1).toString() + ", selling at "+amount+"$ with "+price+" left"); 
		            
		            list2.add(grocery);
		            
					break;
						
				case "lp":
					for(int i= 0;i<list.size();i++) {
						System.out.println(list.get(i).toString());
					}
					
					break;
				
				case "ls":	
					for(int i= 0;i<list2.size();i++) {
						System.out.println(list2.get(i).toString());
					}
					
					break;	
				
				case "sp":
					int product = scan.nextInt();
					int sellingAmount = scan.nextInt();
					int sellingPrice = scan.nextInt();
                    boolean x = true;
					for(int i =1; i<list2.size();i++) {
						
						
					if(product==list2.get(i).getProduct().getProductNo() && sellingPrice==list2.get(i).getAmount()) {	
						x = false;
						if((list2.get(i).getPrice()) < sellingAmount) {	
							System.out.println("There are not enough products. Amount of the product in the stock: " + (list2.get(i).getPrice()));
						}

						else {
							System.out.println("Remaining Stock = "+list2.get(i).getProduct().toString()+", selling at "+list2.get(i).getAmount()+"$ with "+(list2.get(i).getPrice()-sellingAmount)+" left");
						}
					}
					if(x==true) {
						System.out.println("There is no such product selling at "+sellingPrice+"$. Please try again with correct price.");
					}
					}
					break;
					
			}
			command = scan.next();
		}

		for(int i= 0;i<list2.size();i++) {
			System.out.println(list2.get(i));
		}
		
	}
}
