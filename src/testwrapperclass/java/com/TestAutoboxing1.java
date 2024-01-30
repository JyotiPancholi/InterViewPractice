package testwrapperclass.java.com;

/*
We can store the null value in wrapper objects. For example,
=====generates an error
int a = null;
// runs perfectly
Integer a = null;
*/
public class TestAutoboxing1 {

	public static void main(String[] args) {
		int a=23;
		Integer i = new Integer(a);//converting int into integer explicitely
		Integer j = a; //autoboxing, now compiler will write Integer.valueOf(a) internally  
	System.out.println(a+" "+i+" "+j);
	}
}
