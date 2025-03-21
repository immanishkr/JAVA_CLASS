package mypackage;


class Hi{
	static int b = 10;
	
	static void hello() {
		
		System.out.println("manish");
		
	}
}

public class New_p {
	
	static int a = 10;
	
	private int c = 20; 
	
	static void greet() {
		
		System.out.println("kumar");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(a);
		
		System.out.println(Hi.b);
		
		Hi.hello();
		
		greet();
		
		New_p m = new New_p();
		
		
		System.out.println(m.c);
		
		
		
		
		
	}

}
