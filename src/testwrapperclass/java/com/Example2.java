package testwrapperclass.java.com;
/*
Note: We can also convert primitive types into wrapper
objects using Wrapper class constructors. But the use of 
constructors is discarded after Java 9.
*/

//Wrapper Objects into Primitive Types : unboxing

public class Example2 {

	public static void main(String[] args) {
		// creates objects of wrapper class
	    Integer aObj = Integer.valueOf(23);
	    Double bObj = Double.valueOf(5.55);

	    // converts into primitive types
	    int a = aObj.intValue();
	    double b = bObj.doubleValue();

	    System.out.println("The value of a: " + a);
	    System.out.println("The value of b: " + b);
	}
}

/*
In the above example, we have used the intValue() and doubleValue() 
method to convert the Integer and Double objects into corresponding primitive types.

However, the Java compiler can automatically convert objects into corresponding 
primitive types. For example,
--------------------------------------------
Integer aObj = Integer.valueOf(2);
// converts into int type
int a = aObj;

Double bObj = Double.valueOf(5.55);
// converts into double type
double b = bObj;
*/