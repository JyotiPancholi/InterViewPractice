package javainnerclasses.com;
//But the following code compiles and runs fine (Note that x is final this time) 
class Outer2 {
	   void outerMethod() {
	      final int x=98;
	      System.out.println("inside outerMethod");
	      class Inner {
	         void innerMethod() {
	            System.out.println("x = "+x);
	         }
	      }
	      Inner y = new Inner();
	      y.innerMethod();
	   }
	}
public class Example3 {

	public static void main(String[] args) {
		 Outer2 x = new Outer2();
	      x.outerMethod();
	}

}
