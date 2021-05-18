import java.util.Scanner;
public class Kiwi extends Apple  {
	private String taste;
	private int choosing=1;
	Scanner scan = new Scanner (System.in);
	public Kiwi(String name, int quantity, double price) {
		  super(name,quantity,price);
	      System.out.println("Kiwi constructor is invoked");
	      
	   
	}
	    //method
	 public String taste () {
		 do {
			 System.out.println ("Taste rate (1 - 3/ very sweet - not sweet");
			 this.choosing = scan.nextInt();
			 
			 if (choosing == 1) {
				 return this.taste = " Very sweet";
			 }
			 else if (choosing == 2) {
				 return this.taste = "Sweet";
			 }
			 else {
				 return this.taste = "Not sweet";
			 }
		 }while (choosing !=1 || choosing !=2 || choosing !=3);
	 }
	    		
	    		
	    
	    public String gettaste () {
	    	return this.taste;
	    
	    
	  }
	    public String toString (){
			return ("Fruit : "+ super.name + "Taste :"+ taste);
		}
	    public void totPrice (int quantity, double price) {
	    	double total = quantity*price;
	    	System.out.println (" Total amount of Kiwi :"+total);
	    }

}
