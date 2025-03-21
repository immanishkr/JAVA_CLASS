package Demo;
import java.util.Scanner;

public class Questions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner hi =new Scanner(System.in);
		
		System.out.println("enter principal:");
		int a = hi.nextInt();
		
		System.out.println("enter years:");
		int b = hi.nextInt();
		
		System.out.println("enter interest:");
		int c = hi.nextInt();
		
		int d = b*c;
		
		int e= a+b*c;
		
		System.out.println("total interest:"+d);
		System.out.println("total amount:"+e);
		
		
		

	}

}
