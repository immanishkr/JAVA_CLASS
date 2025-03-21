package mypackage;

// concept : has relationship , where one parent class can inherit the properties from other parent class using object

// object creation is done in the class we want to inherit



class Engine{    // parent 1
	
	void start() {
		System.out.println("Engine Start");
	}
}



class Car{  // parent 2
	
	Engine e = new Engine();
	
	void stop() {
		System.out.println("Engine Stop");
		
		e.start();
	}
}

class Bike{
	
	Car c2 = new Car();
	void moving() {
		System.out.println("car moving");
		c2.stop();
	}
}

public class Composition {

	public static void main(String[] args) {
		
		
		
		Bike b = new Bike();
		
		b.moving();

	}

}
