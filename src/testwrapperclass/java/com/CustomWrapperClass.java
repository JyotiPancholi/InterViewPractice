package testwrapperclass.java.com;

//Java Wrapper classes wrap the primitive data types, that is why it is known as 
//wrapper classes. We can also create a class which wraps a primitive data type.
//So, we can create a custom wrapper class in Java.
class TestwraperClass{
	private int i;

	public TestwraperClass(int i) {
		this.i = i;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
	@Override
	public String toString() 
	{
		return Integer.toString(i);
		
	}
}
public class CustomWrapperClass {

	public static void main(String[] args) {
		TestwraperClass t = new TestwraperClass(56);
		System.out.println(t);
	}
}
