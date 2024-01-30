package test_accessspecifiers.java.com;
import test_accessspecifiers.java.com.TestPublic1;
public class TestPublic2 {

	public static void main(String[] args) {
		 // public variables x and y can be accessed within the package
	      
	      // value of static variable x is displayed
	      System.out.println("value of x from TestPublic clas = " + TestPublic1.x);  
	      
	      TestPublic1 obj = new TestPublic1();
	      obj.y = 40;
	      // value of static variable y is displayed
	      System.out.println("value of y from TestPublic clas = " + obj.y);  
	}
}
//  go to TestPublic3