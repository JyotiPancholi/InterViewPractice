package testabstract.com;

//Abstract classes can also have final methods (methods that cannot be overridden)
abstract class TestBase1 {
    final void fun()
    {
        System.out.println("Base fun() called");
    }
}
class TestDerived1 extends TestBase1 {
}
public class AbstractSix {

	public static void main(String[] args) {
		TestBase1 b = new TestDerived1();
	        // Calling method on object created above
	        // inside main()
	        b.fun();
    	}
   }
