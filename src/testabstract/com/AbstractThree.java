package testabstract.com;

abstract class Base
{
	  abstract void fun();
}
class Deriverd extends Base
{

	@Override
	void fun() {
		System.out.println("Fun function in  derivered class");
	}
	
}
public class AbstractThree {

	public static void main(String[] args) {
//		Deriverd d =  new Deriverd();
//		d.fun();
		Base b =  new Deriverd();
		b.fun();
	}

}
