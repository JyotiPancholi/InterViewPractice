//package javainnerclasses.com;
//
//class OuterClass1 {
//	  int x = 10;
//
//	  private class InnerClass {
//	    int y = 5;
//	  }
//	}
//public class PrivateInnerClass {
//
//	public static void main(String[] args) {
//		 OuterClass1 myOuter = new OuterClass1();
//		    OuterClass1.InnerClass myInner = myOuter.new InnerClass();
//		    System.out.println(myInner.y + myOuter.x);
//	}
//
//}


//error: OuterClass.InnerClass has private access in OuterClass
//OuterClass.InnerClass myInner = myOuter.new InnerClass();