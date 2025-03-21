package mypackage;

import java.util.Scanner;


abstract class App{
	
	abstract void open();
	
	String phone_no;
	
	String otp;
	
	void login_input() {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter phone no:");
		phone_no=sc.nextLine();
		
		System.out.println("Enter OTP:");
		otp=sc.nextLine();
		
		}
	
	void login_dispaly() {
		
		System.out.println("welcome to whatsapp");
		System.out.println("---------------------");
		System.out.println("please login here");
		System.out.println("-----------------------");
	}
	
	

	
	
}

class Implement extends App{
	@Override
	void open() {
		while(true) {
			if(phone_no.equals("9101133787") && otp.equals("1234")) {
				System.out.println("login successful");
				break;
			}else {
				System.out.println("----------");
				System.out.println("login failed");
				System.out.println("----------");
				System.out.println("plzz try again");
				login_input();
			}
		}
	}
	
}

public class Whatsapp {

	public static void main(String[] args) {
		
		
		Implement i = new Implement();
		
		i.login_dispaly();
		i.login_input();
		i.open();

	}

}
