package test_accessspecifiers.java.com;

public class TestDefault2 {

	public static void main(String[] args) {
     // variables x and y can be accessed within the package
	 // static variable's value is displayed 
	 System.out.println("value of x from TestDefault clas = " + TestDefault1.x); 
	    
	 TestDefault1 obj = new TestDefault1();
	 obj.y = 45;
	 // Non static variable's value is displayed
	 System.out.println("value of x from TestDefault clas = " + obj.y); 
	}
}
