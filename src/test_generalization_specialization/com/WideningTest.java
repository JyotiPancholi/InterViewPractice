package test_generalization_specialization.com;

class A {
	 void m1(){
	   System.out.println("Superclass method");	 
	 }
	}
class B extends A{
	 void m2(){
	   System.out.println("Subclass method");	 
	 }
	}

public class WideningTest {

  public static void main(String[] args) {
	A a; // a is superclass reference variable.
	a = (A)new B(); // generalization (widening) because a is referring to subclass object. 
	a.m1();
	}

}
