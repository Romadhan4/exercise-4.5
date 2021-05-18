
public class RedApple extends Apple {
	private String colour,taste ;
	private double weight ;
	public RedApple (String name,int quantity,double price, String colour,double weight,String taste) {
		 super (name,quantity,price);
		 this.weight = weight ;
		 this.colour=colour ;
		 this.taste = taste ;
		 
		 System.out.println("Red Apple is involved");
		 


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
