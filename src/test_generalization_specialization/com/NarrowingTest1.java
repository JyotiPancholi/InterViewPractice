package test_generalization_specialization.com;

class Aaa {
	 void m1(){
	   System.out.println("Superclass method");	 
	 }
	}
class Bbb extends Aaa{
	 void m2(){
	   System.out.println("Subclass method");	 
	 }
	}
public class NarrowingTest1 {

	public static void main(String[] args) {
		Bbb b; // b is subclass reference variable.
		b = (Bbb)new Aaa(); // specialization (narrowing) because b is referring to superclass object. 
		b.m1();
	}

}

//  run time error