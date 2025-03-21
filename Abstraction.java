package mypackage;

// showing functionality and hiding internal implementation

// abstract keyword 

// abstract method does not have any body

// we have to create functionality of abstract method in child class 


abstract class Flowers{        // abstract class
	
	abstract void smell();     // abstract method
}

class Rose extends Flowers{      // child class for creating the body of abstract method
	
	
	@Override
	void smell() {
		
		System.out.println("Rose Smell");
		
	}
}

class Lotus extends Flowers{
	@Override
	void smell() {
		System.out.println("Lotus Smell");
	}
}

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Rose R = new Rose();
		
		R.smell();
		
		Lotus L=new Lotus();
		
		L.smell();
		
		

	}

}
