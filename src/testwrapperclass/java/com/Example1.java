package testwrapperclass.java.com;

public class Example1 {

	public static void main(String[] args) {
		int a = 78;
		double b = 45789;
//		converts into wrapper objects
		Integer x = Integer.valueOf(a);
		Double  y = Double.valueOf(b);
		if (x instanceof Integer) {
			System.out.println("An object of Integer is created");
		}
		if (y instanceof Double) {
			System.out.println("An object of double is created.");
		}
 	}
}
/*
 
In the above example, we have used the valueOf() method to 
convert the primitive types into objects.

Here, we have used the instanceof operator to check whether 
the generated objects are of Integer or Double type or not.

However, the Java compiler can directly convert the primitive 
types into corresponding objects.
 
*/