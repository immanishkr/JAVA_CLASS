package mypackage;

// Encapsulation 
// getter and setter method to access private modifier in main method


class New{
	
	private static String name1 = "manish"; 
	
	private static String name2;
	
	public String getName1() {   //getter
		return name1;
	}
	
	public String getName2(){      //getter
		
		return name2;
		
	}
	
	public void setName2(String name2) {      //setter
		this.name2=name2;
	}
	
}

public class Encapsulation {
	
	private static int a=100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("value:"+a);
		
		New n=new New();
		
		System.out.println("my name:"+n.getName1());
		
		n.setName2("manish");
		
		System.out.println("my name:"+n.getName2());
		
		
		
		

	}

}
