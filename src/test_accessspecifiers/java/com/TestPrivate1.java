package test_accessspecifiers.java.com;

public class TestPrivate1 {
	 
	  // these variables have private access specifier and will only be visible within same class.
	     private static int x = 10;
	     private int y ;
	     
	     public static void main(String[] args) {
	       
	       // default variables can be accessed within same class 
	       // static variable's value is displayed
	       System.out.println("value of x from TestPrivate clas = " + TestPrivate1.x);
	       
	       TestPrivate1 obj=new TestPrivate1();
	       obj.y=35;
	       // Non static variable's value is displayed 
	       System.out.println("value of x from TestPrivate clas = " + obj.y); 

	}
}
