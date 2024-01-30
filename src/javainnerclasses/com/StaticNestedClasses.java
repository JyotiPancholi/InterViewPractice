package javainnerclasses.com;

//Static nested classes are not technically inner classes.
//They are like a static member of outer class

class Outer4 {
    private static void outerMethod()
    {
        System.out.println("inside outerMethod");
    }
    static class Inner {
        public static void display()
        {
            System.out.println("inside inner class Method");
            outerMethod();
        }
    }
}
public class StaticNestedClasses {

	public static void main(String[] args) {

        Outer4.Inner obj = new Outer4.Inner();
        obj.display();
    
	}
}
