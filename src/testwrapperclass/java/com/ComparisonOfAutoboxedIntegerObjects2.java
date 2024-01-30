package testwrapperclass.java.com;

public class ComparisonOfAutoboxedIntegerObjects2 {

	public static void main(String[] args) {
		Integer x = 40, y=40;
		if (x==y) {
			System.out.println("same");
		} else {
			System.out.println("not same");
		}
	}
}

/*
reason : 
	In Java, values from -128 to 127 are cached, so the same 
	objects are returned. The implementation of valueOf() uses 
	cached objects if the value is between -128 to 127.

	If we explicitly create Integer objects using new operator,
	we get the output as “Not Same”. See the following Java 
	program. In the following program, valueOf() is not used.
*/
//go to ComparisonOfAutoboxedIntegerObjects3