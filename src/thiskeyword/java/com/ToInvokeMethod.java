package thiskeyword.java.com;
//this: to invoke current class method
public class ToInvokeMethod {
	void m()
	{
		System.out.println("hello ! method m ");
	}
	void n() 
	{
		System.out.println("hello ! method n");
		this.m();
	}
//}
//class TestMe{
	public static void main(String[] args) {
		ToInvokeMethod t = new ToInvokeMethod();
		t.n();
	}

}
