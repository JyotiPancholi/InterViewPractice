package testcallbyvalue.callbyrefrnc.com;
//practicing TestCallByReference again here
public class TestCallByReference_1 {

	public static void main(String[] args) {
		IntWrapper1 a =  new IntWrapper1(34);
		IntWrapper1 b = new IntWrapper1(50);
		System.out.println("before swapping : a = "+ a.x + " and b = "+b.x);
		swapping(a,b);
		System.out.println("now ,before and after swapping the values will be changed");
		System.out.println("After swapping, a = " + a.x + " and b is " + b.x);
	}

	private static void swapping(IntWrapper1 a, IntWrapper1 b) {
		System.out.println("Before swapping(Inside), a = " + a.x + " b = " + b.x);
	      // Swap n1 with n2
		IntWrapper1 c = new IntWrapper1(a.x);
		a.x = b.x;
		b.x = c.x;
		System.out.println("After swapping(Inside), a = " + a.x + " b = " + b.x);
	}
}

class IntWrapper1

{
int x;

public IntWrapper1(int x) {
	this.x = x;
   }
}