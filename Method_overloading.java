
// Method_overloading using same method name but passing different parameters
// in Method_overloading the return type should be same as datatype




package mypackage;


class Addition{
	public void add() {  // normal method
		int a=2;
		int b=3;
		System.out.println("sum:"+(a+b));
	}
	
	public int add(int a,int b) {  // method overloading
		return a+b;
		
	}
	
	public int add(int a,int b,int c) {  // method overloading
		return a+b+c;
		
	}
	
	
	public String name(String a,String b) {
		
		return a+b;
		
	}
   
}



public class Method_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition s=new Addition();
		s.add();
		System.out.println("sum:"+s.add(34,45));
		System.out.println("sum:"+s.add(34,45,67));
		
		System.out.println("my name is:"+s.name("manish", "kumar"));
		
		

	}

}
