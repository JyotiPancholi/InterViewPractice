package test_polymorphism.com;

class ABC{

	   public void myMethod(){

	System.out.println("Overridden Method");

	   }

	}
public class DynamicPolymorphysm2 extends ABC{

	public void myMethod(){

		System.out.println("Overriding Method");

		   }
	public static void main(String[] args) {
		ABC a = new DynamicPolymorphysm2();
		a.myMethod();
	}

}
