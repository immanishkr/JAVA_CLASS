package oop;

import java.util.Scanner;


public class third {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter principal=");
	int number1 = scanner.nextInt();
	
	System.out.println("Enter years=");
	int number2 = scanner.nextInt();
	
	System.out.println("Enter interest=");
	int number3 = scanner.nextInt();
	
	int t1= number2*number3;
	int t2= number1+t1;
	
	System.out.println("total interest: " + t1);
	System.out.println("total amount: " + t2);
	 
	}

}
