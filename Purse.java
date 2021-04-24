
import java.util.Scanner;

public class Purse {	
	
	Scanner sc = new Scanner(System.in);
	private double weight, width, length, height;	
	private int membership;
	
	//Default constructor
	
	Purse(){
		System.out.print("Enter Purse's Weight : ");
		this.weight = sc.nextDouble();
		System.out.print("Enter Purse's Width : ");
		this.width = sc.nextDouble();
		System.out.print("Enter Purse's Length : ");
		this.length = sc.nextDouble();
		System.out.print("Enter Purse's Height : ");
		this.length = sc.nextDouble();
	}
	
	int membership() {
		System.out.println("Become our membership? ");
		this.membership = sc.nextInt();
		switch (membership) {
			case "yes":
				System.out.println("Thank you for being one of our vvip.");
				break;
			case "No":
				System.out.println("There's no discount for this item.");
				break;
		}
		return membership;
		
	}
	
	double getWeight() {
		return this.weight;
	}
	
	double getWidth() {
		return this.width;
	}
	
	double getLength() {
		return this.length;
	}
	
	double getHeight() {
		return this.height;
	}
}



