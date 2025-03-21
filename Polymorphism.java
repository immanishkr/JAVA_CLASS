package mypackage;



// polymorphism in java : CTP and  RTP
// 


//CTP : compile time poly is method over-loading, it is not a complete polymorphism

//RTP : run time poly is 

public class Polymorphism {
	
	
	public static int add(int a, int b) {
		return a+b;
		
	}
	
	public static double add(double a, double b) {
		
		return a+b;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("method 1:"+add(10,20));
		System.out.println("method 2:"+add(100,200));
		
		
		

	}

}




class Animal{
	public void sound() {
		System.out.println("animal sounds");
		
	}
}

class Dog extends Animal() {
	
	
	@Override  // it is method overriding where we can use same method name and parameter
	
	// static is not needed for method overriding
	
	
	public void sound() {
		System.out.println("bow bow");
	}
}

public class Polymorphism2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog g=new Dog();
		d.sound();
		
		
		
		
		
		

	}


}





