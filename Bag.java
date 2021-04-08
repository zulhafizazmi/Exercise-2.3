import java.util.Scanner;

public class Bag {
	
     String brand;
     String colour;
     double weight;
     char waterResistant;
     
     Scanner s = new Scanner(System.in);
	
     void detail() {
    	 
    	 System.out.println("Enter brand, colour and weight : ");
    	 String a = s.nextLine();
    	 String b = s.nextLine();
    	 double c = s.nextInt();
    	 
    	 System.out.println("Bag brand = " + a );
    	 System.out.println("Colour = " + b );
    	 System.out.println("Bag weight = " + c + " kg ");
    	 
     }
    	 
    	 void waterResistant(String name) {
        	 do {
        	 System.out.println("\nDoes this bag waterResistant? (y-yes,n-no)");
        	 waterResistant = s.next().charAt(0);
        	 switch(waterResistant){
        	 case'y':System.out.println(brand + " waterResistant.");break;
        	 case'n':System.out.println("\n" + brand + " not waterResistant.");break;
        	 default : System.out.print("Error. Wrong choice!(Input only 'y' or 'n'.)");
        	 }
        	 
        	 }while (waterResistant != 'y' && waterResistant != 'n');
        
    	 
    	 }
     
    	 void Quantity() {
       	  System.out.println("Enter the price : RM ");
       	  double d = s.nextDouble();
         	  System.out.println("Enter the quantity : ");
         	  int bag = s.nextInt();
         	
             int totalItem = (int) (bag * d) ;
             System.out.println("Total price item : RM " + totalItem); 
             System.out.println("\n--next--");
         }
     
     
    	 void totalPrice() {
    			System.out.println("How many bag do you want to buy?");
    			int quantity = s.nextInt();
    			System.out.println("Enter the price");
    			double money = s.nextDouble();
    			double totalPrice = quantity*money;
    			System.out.println("Total price of the bag:"+ totalPrice);
		   
	   }

}


