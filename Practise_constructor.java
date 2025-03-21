package mypackage;



public class Practise_constructor {
	String model;
	int year;
	
	
// Default constructor
	public Practise_constructor() {
		this.model = "Unknown";
		this.year = 0;
		}
	
	
// Parameterized constructor
	public Practise_constructor(String model, int year) {

		this.model = model;

		this.year = year;

	}

	public void displayDetails() {
		System.out.println("Model: " + this.model + ", Year: " + this.year);
	}
	
	
	public static void main(String[] args) {
		
		
	// Using default constructor
		
		Practise_constructor car1 = new Practise_constructor();
		car1.displayDetails();
		
		
	// Using parameterized constructor
		
		
		Practise_constructor car2 = new Practise_constructor("Toyota", 2022);
		car2.displayDetails();
		}
	}
 


