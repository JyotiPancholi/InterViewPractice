package test_accessspecifiers.java.com;

public class TestDefault1 {
	 // these variables have default access specifier as no specifier is mentioned
	   static int x = 10;
	   int y ;
	   
	public static void main(String[] args) {
	 // default variables can be accessed within same class 
	 // static variable's value is displayed
	 System.out.println("value of x from TestDefault clas = " + TestDefault1.x);  
	 TestDefault1 obj=new TestDefault1();
	 obj.y = 25;
	     // Non static variable's value is displayed 
	     System.out.println("value of x from TestDefault clas = " + obj.y); 
	}
}
