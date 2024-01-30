package javainnerclasses.com;

//Inner class can be declared within a method of an outer class 
class Outer1 {
    void outerMethod()
    {
        System.out.println("inside outerMethod");
        class Inner {
            void innerMethod()
            {
                System.out.println("inside innerMethod");
            }
        }
        Inner y = new Inner();
        y.innerMethod();
    }
}
public class MethodLocalInnerClasses {

	public static void main(String[] args) {
        Outer1 x = new Outer1();
        x.outerMethod();
	}
}

//go to example2