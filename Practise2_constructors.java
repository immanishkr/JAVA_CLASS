package mypackage;


class Sruits{
	String name;
	
	Sruits(){
		this.name="Apple";
		System.out.println("fruit name :"+this.name);
		
	}
	
	Sruits(String name){
		this.name=name;
		System.out.println("fruit name :"+name);
	}
	
}



public class Practise2_constructors {	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sruits f=new Sruits();
		
		Sruits f1=new Sruits("Mango");

	}

}
