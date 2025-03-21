
//constructors in java
// 2 types of constructor
// default and parameter
//no  2 default constructor in a same class
// in a same class two parameter with different datatype is allowed but not same datatypes



package mypackage;

class Fruits{
	Fruits(){ //default constructor
		System.out.println("default constructor");
	}
	Fruits(String name){ // parameter constructor
		System.out.println("parameter constructor");
		System.out.println("fruits:"+name);
	}
}


public class Constructors_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruits f = new Fruits();
		
		Fruits f1 = new Fruits("orange");
		
		

	}

}
