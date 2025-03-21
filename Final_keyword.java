package mypackage;

// final keyword
// we can use final keyword in class,variable, and method
// static variable value cannot be updated
// updation is allowed  only inside main method
// final keyword does not let the variable to change its value i.e does not allow reassigning
//final keyword does not let the method  to use the same name in different method i.e does not allow use same name to differnt method
//final keyword does not let the class to inherit i.e child class cannot inherit from the final parent class



class Userdefine{
	final public void final() {
		System.out.println("i am parent class");
	}
}

class Final extends userdefine{
	public void final1() {
		System.out.println("i am child class");
	}
	
}


public class Final_keyword {
	
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=100;
		a=500;
		
		System.out.println("value:"+a);
		
		
		Final f = new Final();
		f.final();
		
		
		
		
		

	}

}
