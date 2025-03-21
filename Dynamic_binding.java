package mypackage;



//Dynamic binding in Polymorphism.
// in method overriding we cannot access variables outside the method
// we can declare variables inside method of a parent class and access in child class using this or super keyword

class Vehicles{    //parent class
	
	public void vehicles_details() {
		
		System.out.println(" vehicles_details");
		
	}
}

class Car1 extends Vehicles{   //child class
	@Override
	
	public void vehicles_details() {
		String car_name="bmw";
		String car_color="blue";
		System.out.println(" car1_name:"+car_name);
		System.out.println(" car1_color:"+car_color);
	}

}

class Car2 extends Vehicles{   //child class
	@Override
	
	public void vehicles_details() {
		String car_name="ferrari";
		String car_color="red";
		System.out.println(" car2_name:"+car_name);
		System.out.println(" car2_color:"+car_color);
	}

}

public class Dynamic_binding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car1 c=new Car1();
		
		c.vehicles_details();
		
		Car2 C2=new Car2();
		
		C2.vehicles_details();
		
		

	}

}
