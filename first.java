package oop;

import java.util.Scanner;

public class first {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter first name=");
		 
		 String input1 = scanner.nextLine();
		 
		 System.out.println("Enter last name=");
		 
		 String input2 = scanner.nextLine();
		 
		 System.out.println("Enter id no=");
		 int number1 = scanner.nextInt();
		 
		 System.out.println("Enter mark1=");
		 int number2 = scanner.nextInt();
		 
		 System.out.println("Enter id no=");
		 int number3 = scanner.nextInt();
		 
		   
	        System.out.println("First Name: " + input1);
	        System.out.println("Last Name: " + input2);
	        System.out.println("ID Number: " + number1);
	        System.out.println("Mark 1: " + number2);
	        System.out.println("Mark 2: " + number3);

	        scanner.close();
		 
		 

	}

}
