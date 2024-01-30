package javainnerclasses.com;

//Method Local inner classes can’t use a local variable of the outer method 
//until that local variable is not declared as final. For example, the 
//following code generates a compiler error.

class Outer3 {
	   void outerMethod() {
	      int x = 98;
	      System.out.println("inside outerMethod");
	      class Inner {
	         void innerMethod() {
	            System.out.println("x= "+x);
	         }
	      }
	      Inner y = new Inner();
	      y.innerMethod();
	   }
	}
public class Example2 {

	public static void main(String[] args) {
		 Outer3 x=new Outer3();
	      x.outerMethod();
	}

}

//Note: Local inner class cannot access non-final local variable till JDK 1.7.
//Since JDK 1.8, it is possible to access the non-final local variable in 
//method local inner class. 

//go to example 3