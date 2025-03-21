package mypackage;

// InstanceOf keyword is used to check the object.



class Animals{
	
}

class Dogs extends Animals{
	
}

public class InstanceOF_keyword {
	
	int a = 10;

	public static void main(String[] args) {
		
		
		
		Animals A=new Animals();
		
		System.out.println(A instanceof Animals);
		
		Dogs D=new Dogs();
		
		System.out.println(D instanceof Dogs);
		
		

	}

}
