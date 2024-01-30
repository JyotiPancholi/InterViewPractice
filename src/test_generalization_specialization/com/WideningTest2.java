package test_generalization_specialization.com;

class Aa {
	 void m1(){
	   System.out.println("Superclass method");	 
	 }
	}
class Bb extends Aa{
	 void m1() // Overriding superclass method.
	 {
	   System.out.println("Subclass method");	 
	 }
	}
public class WideningTest2 {

	public static void main(String[] args) {
		 Aa a; // a is superclass reference variable.
		 a = (Aa)new Bb(); // generalization (widening) because a is referring to subclass object. 
		 a.m1();
	}
}
