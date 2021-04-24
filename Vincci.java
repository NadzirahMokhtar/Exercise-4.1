
import java.util.Scanner;

public class Vincci extends Purse {
	
	//Vincci as subclass and Purse as Parent class
		Scanner sc = new Scanner(System.in);
		
		private double weight,price; 
		private String color,shape;
		private boolean withWithout;
		private int size,compartments,quantity;
		private double totalPrice;
		
		Vincci(){	
			
			System.out.println("--------------------------------------------");
			System.out.println("Vinci");
			System.out.println("--------------------------------------------");
			System.out.println("Enter the Color");
			this.color = sc.nextLine();
			System.out.println("Enter the Size");
			this.size = sc.nextInt();
			System.out.println("Enter the Compartments");
			this.compartments = sc.nextInt();
			System.out.println("Enter the Quantity");
			this.quantity = sc.nextInt();
			System.out.println("Enter the Price");
			this.price = sc.nextDouble();
			
			this.totalPrice = this.price * this.quantity;
		
		System.out.println("With/Without");
		this.withWithout = sc.nextBoolean();
			if (withWithout == true) {
				System.out.println("The Purse come with the chain!");
				System.out.println();
			}
			else 
				System.out.println("The Purse come without chain!");
			
		System.out.println("Enter the Shape: ");
		this.shape = sc.nextLine();
		System.out.println("The Shape of the Purse: " + this.shape);
	}
	
		public String getColor() {
			return this.color;
	}
		public int getSize() {
			return this.size;
	}
		public int getCompartments() {
			return this.compartments;
	}
		public int getQuantity() {
			return this.quantity;
	}
		public double getTotalPrice() {
			return this.totalPrice;
	}
	   public boolean getWithWithout() {
		   return this.withWithout;
	}
	   public String getShape() {
		   return this.shape;		   
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
}
	  
