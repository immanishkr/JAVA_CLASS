package mypackage;


class Student{
	
	String name;
	
	Student(){
		this.name="manish";
		
		System.out.println("name:"+this.name);
	}
	
	Student(int age){
		
		System.out.println("age:"+age);
		
		
		
	}
	
}

public class Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s= new Student();
		
		Student s1 = new Student(22);

	}

}
