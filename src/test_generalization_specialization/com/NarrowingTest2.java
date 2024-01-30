package test_generalization_specialization.com;

// as we shown in previous program that its is not accepted by compiler to convert superclass type to subclass type 
//hence we have a solution that , We will not create an object of superclass as we did in the previous case.
class Ax {
	 void m1(){
	   System.out.println("Superclass method");	 
	 }
	}
class By extends Ax{
	 void m2(){
	   System.out.println("Subclass method");	 
	 }
	}
public class NarrowingTest2 {

	public static void main(String[] args) {
		A a; // a is superclass reference variable.
		a = new B(); // Superclass reference refers to subclass object.
		B b = (B)a; // Narrowing because we are converting class A's reference type as class B's type.
		b.m1();
		b.m2();
	}
}
