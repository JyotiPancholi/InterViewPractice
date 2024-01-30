package testwrapperclass.java.com;

public class TestUnboxing1 {

	public static void main(String[] args) {
		//Converting Integer to int  
		Integer i = new Integer(34);
		int a = i.intValue(); //converting Integer to int explicitly  
		int b = i;  //unboxing, now compiler will write a.intValue() internally  
		System.out.println(i+" "+a+" "+b);
	}
}
