package mypackage;

class Animalss {
void eat() {
System.out.println("This animal eats food");
}
}
class Dogss extends Animalss {
void eat() {
super.eat(); // Calling superclass method
System.out.println("The dog eats dog food");
}
}
public class Super_keyword {
public static void main(String[] args) {
Dogss dog = new Dogss();
dog.eat();
}
}