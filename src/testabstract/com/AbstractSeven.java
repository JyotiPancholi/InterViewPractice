package testabstract.com;

//Similar to the interface we can define static methods in 
//an abstract class that can be called independently without an object. 

abstract class Helper {
	 
    // Abstract method
    static void demofun()
    {
        // Print statement
        System.out.println("Geeks for Geeks");
    }
}
public class AbstractSeven extends Helper {

	public static void main(String[] args) {
		  Helper.demofun();
	}

}
