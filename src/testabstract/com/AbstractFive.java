package testabstract.com;

abstract class TestBase {
	 
    void fun()
    {
        System.out.println(
            "Function of Base class is called");
    }
}
class Derived extends TestBase {
}
public class AbstractFive {

	public static void main(String[] args) {
		Derived d = new Derived();
        // Calling function defined in class 1 inside main()
        // with object of class 2 inside main() method
        d.fun();
	}
}
