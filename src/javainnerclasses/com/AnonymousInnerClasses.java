package javainnerclasses.com;

//Anonymous inner classes are declared without any name at all. They are created in two ways. 

//As a subclass of the specified type
//As an implementer of the specified interface

class Demo {
    void show()
    {
        System.out.println(
            "i am in show method of super class");
    }
}
 
public class AnonymousInnerClasses {
	 //  An anonymous class with Demo as base class
    static Demo d = new Demo() {
        // Method 1
        // show() method
        void show()
        {
            // Calling method show() via super keyword
            // which refers to parent class
            super.show();
 
            // Print statement
            System.out.println("i am in Flavor1Demo class");
        }
    };
	public static void main(String[] args) {
		 // Calling show() method inside main() method
        d.show();
	}
}

//go to example 1