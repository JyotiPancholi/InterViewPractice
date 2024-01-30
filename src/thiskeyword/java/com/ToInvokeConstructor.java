package thiskeyword.java.com;
//this() : to invoke current class constructor
public  class ToInvokeConstructor {
//Calling default constructor from parameterized constructor:
	void A() 
	{
		System.out.println("hello A");
	}
	ToInvokeConstructor(int x)
	{
		this.A();
		System.out.println(x);
	}
//}
//class TestIt{
	public static void main(String[] args) {
		ToInvokeConstructor t = new ToInvokeConstructor(12);
	}

}
