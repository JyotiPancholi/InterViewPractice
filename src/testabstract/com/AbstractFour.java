package testabstract.com;

abstract class Base1
{
	Base1()
	{
		System.out.println("Base constructor called ");
	}
 abstract void fun();
}
class Derived1 extends Base1{
	  Derived1()
	    {
	        System.out.println("Derived Constructor Called");
	    }
	@Override
	void fun() {
		System.out.println("function implementation in derived class");		
	}
}
public class AbstractFour {

	public static void main(String[] args) {
		Derived1 d =  new Derived1();
		d.fun();
	}
}
