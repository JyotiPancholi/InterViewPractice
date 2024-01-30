package test_accessspecifiers.java.com;

public class TestProtected2 {

	public static void main(String[] args) {
		  // variables x and y can be accessed within the package
	      
	      System.out.println("value of x from TestProtected clas = " + TestProtected1.x);
	      
	      TestProtected1 obj = new TestProtected1();
	      obj.y= 40;
	      //Non static variable's value is displayed
	      System.out.println("value of x from TestProtected clas = " + obj.y);
	}
}

//go to TestProtected3