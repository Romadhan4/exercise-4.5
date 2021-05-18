import java.util.Scanner ;
public class GreenApple extends Apple {
	Scanner scan = new Scanner (System.in);
	private String colour, taste;
	private double weight ;
	public GreenApple (String name,int quantity,double price, String colour,double weight,String taste) {
		 super (name,quantity,price);
		 this.weight = weight ;
		 this.colour=colour ;
		 this.taste = taste;
		 
		 System.out.println("Green Apple is involved");
		 
		
	 }
	public double weight () {
		return weight; 
	}
	public String taste () {
		return taste;
	}
	public String colour () {
		return colour;
	}
	public String toString () {
		return ("Fruit:"+super.name+"Taste :"+this.taste+"Colour :"+this.colour+"Weight :"+this.weight+"g perFruit");
	}

		 
}
