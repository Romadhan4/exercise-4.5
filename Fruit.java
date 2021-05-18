import java.util.Scanner ;
	
public abstract class Fruit {
		Scanner scan = new Scanner (System.in);
		protected  String name ;
		public Fruit (String name) {
			this.name = name ;
			System.out.println (" Fruit constructor is invoked");
			
		}
			public Fruit(String name2, String color, double weight) {
			// TODO Auto-generated constructor stub
		}
		//overriding toString
		public String toString () {
			return ("Fresh Fruits");
		}
		public String getName () {
			return this.name;
		}
	}



