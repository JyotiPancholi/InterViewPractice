package thiskeyword.java.com;
//Calling parameterized constructor from default constructor:
public class ToInvokeConstuctor {
ToInvokeConstuctor()
{
this.A(5);
System.out.println("hello a");
}
void A(int x){  
System.out.println(x);  
}  
	public static void main(String[] args) {
		ToInvokeConstuctor s = new ToInvokeConstuctor();
	}

}
