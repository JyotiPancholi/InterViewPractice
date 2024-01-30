package javainnerclasses.com;

//access outer classes from inner classes
class OuterClass3 {
	  int x = 10;

	  class InnerClass {
	    public int myInnerMethod() {
	      return x;
	    }
	  }
	}
public class InnerClassEx {

	public static void main(String[] args) {
		OuterClass3 myOuter = new OuterClass3();
	    OuterClass3.InnerClass myInner = myOuter.new InnerClass();
	    System.out.println(myInner.myInnerMethod());
	}

}
