package mypackage;



// Modifiers :

// 1] public  : can be accessed in different class, packages, projects
// 2] protect  : only in same package
// 3] Default :  only in same packages
// 4] private : private cannot be accessed in user defined class but only in main class 
//              but can be accessed by using getter() method and setter() method
//              in getter method we only need to initialize the modifier           



class User{  // user defined class
	
	
    public int a=100; // since it a non-static variable so we have to create a object to access, but can be accessed by using getName() method
	
	protected int b = 200;
	
	int c= 300; // Default
	
	// private
	
	private String d = "manish";   // for getter method : when value is declared
	
	private String e;  // for setter method : when value is not declared
	
    String getName() {  //getter method
		
		return d;
		
	}
	
    void setName(String e) { // setter method
	   this.e=e;
	}
	
	
	
}

public class Modifiers {
	
	public int a=100; // since it a non-static variable so we have to create a object to access
	
	protected int b = 200;
	
	int c= 300; // Default
	
	private String d = "manish";

	public static void main(String[] args) {
		
		
		//main class
		
		Modifiers m = new Modifiers();
		
		System.out.println(m.a);
		
		System.out.println(m.b);
		
		System.out.println(m.c);
		
		System.out.println(m.d);
		
		
		
		// user class
		
        User k = new User();
		
		System.out.println(k.a);
		
		System.out.println(k.b);
		
		System.out.println(k.c);
		
		System.out.println(k.getName());
		
		k.setName("manish");
		
		
		
		
		
		
		

	}

}
