package mypackage;

;

interface Animal10{
	abstract void sound();
	
}	
	
class Horse implements Animal10{
	public void sound(){
		System.out.println("Horse sound:Woof woof Woof");
	}
}

class Tiger implements Animal10{
	public void sound() {
		System.out.println("Tiger sound:roar roar");
	}
	
}
public class Interface {

	public static void main(String[] args) {
		Horse a = new Horse();
		a.sound();
		Tiger b = new Tiger();
		b.sound();
	}

}
