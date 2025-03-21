package mypackage;

import java.util.Scanner;

// we can only create abstract method inside a abstract class

abstract class Apps{        // abstract parent class
	
	String user_name;
	
	String password;
	
	void user_input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter user name:");
		user_name=sc.nextLine();
		System.out.println("Enter password");
		password=sc.nextLine();
	}
	
	void user_login(){
		System.out.println("Welcome to instagram");
		System.out.println("---------------------");
		System.out.println("please log in here..");
	}
	
	abstract void open();      // abstract  method
}


class Insta extends Apps{
	
	@Override
	
	void open() {
		
		while(true) {
			if(user_name.equals("Manish") && password.equals("123@")) {
				
				System.out.println("App is open");
				break;
				
			}else {
				System.out.println("login failed...");
				user_input();
			}
		}
		
		
		
	}
}


public class Implementaion_Abstraction {

	public static void main(String[] args) {
		
		Insta i = new Insta();
		
		i.user_login();
		
		i.user_input();
		
		i.open();

	}

}
