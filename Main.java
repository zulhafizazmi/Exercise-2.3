public class Main {

	public static void main(String[] args) {
		
		
		Bag adidas = new Bag(); 
		
		System.out.println(" adidas ");
		adidas.detail();
		adidas.waterResistant("adidas");
		adidas.Quantity();
		adidas.totalPrice();
		
		System.out.println();
		
		Bag nike = new Bag(); 
	    
		System.out.println(" nike ");
	    nike.detail(); 
	    nike.waterResistant("nike");
	    nike.Quantity(); 
	    nike.totalPrice(); 

	}

}
