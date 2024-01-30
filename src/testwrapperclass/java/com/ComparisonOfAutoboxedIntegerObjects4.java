package testwrapperclass.java.com;

public class ComparisonOfAutoboxedIntegerObjects4 {

	public static void main(String[] args) {
		Integer x = new Integer(10);
		Integer y = 10;
		// Due to auto-boxing, a new Wrapper object
	    // is created which is pointed by Y
		System.out.println(x==y);
	}
}

/*
Explanation: Two objects will be created here. First object 
which is pointed by X due to calling of new operator and 
second object will be created because of Auto-boxing.
*/