import java.util.Scanner ;
public class Apple extends Fruit {
		
		// TODO Auto-generated constructor stub
	Scanner scan = new Scanner (System.in);
		protected String colour;
	    protected double price = 1.05 ;
	    private double totPrice;
	    private double disc ;
	    private int quantity ;
	    
	    //parameter
	    public Apple(String name, int quantity,double price) {
	    super (name);
	    this.quantity = quantity ;
	    this.price = price;
	    System.out.println ("Apple constructor is invoked");
}
	    //method
	    public void buying (double price) {
	    	System.out.println ("Enter quantity");
	    	quantity = scan.nextInt();
	    	System.out.println ("Total price :"+totPrice);
	    	
	    	if (this.quantity >=1 && this.quantity <=10) {
	    		
	    		totPrice ();
	    		System.out.println ("Total price : RM"+totPrice);
	    	}
	    	else  {
	    		double price1 = 0.90 ;
	    		totPrice();
	    		System.out.println ("Total price : RM"+totPrice);
	    	}
	    	
	    }
	    
		
		
			
		
		public String colour () {
			return colour = "Red,Green";
		}
		public double totPrice () {
			return this.price * this.quantity;
		}
		public String toString () {
	    	return ("Fruit :"+ super.name +"Colour :"+this.colour);
	    }
	    }