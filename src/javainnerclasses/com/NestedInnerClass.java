package javainnerclasses.com;

//                         Type 1: Nested Inner Class 

class Outer {
    class Inner {
        public void show()
        {
            System.out.println("In a nested class method");
        }
    }
}
public class NestedInnerClass {

	public static void main(String[] args) {
        Outer.Inner in = new Outer().new Inner();
        in.show();
	}
}

