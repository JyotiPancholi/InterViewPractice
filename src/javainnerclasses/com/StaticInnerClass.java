package javainnerclasses.com;
//example for static inner class

//just like static attributes and methods,
//a static inner class does not have access to members of the outer class.

class OuterClass2 {
	  int x = 10;

	  static class InnerClass {
	    int y = 5;
	  }
	}
public class StaticInnerClass {

	public static void main(String[] args) {
		 OuterClass2.InnerClass myInner = new OuterClass2.InnerClass();
		 System.out.println(myInner.y);
	}

}
