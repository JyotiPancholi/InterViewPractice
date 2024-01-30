package javainnerclasses.com;

//As an implementer of the specified interface  
interface Hello {
	 
    // Method defined inside interface
    void show();
}
public class Example1 {
	 // Class implementing interface
    static Hello h = new Hello() {
       
        // Method 1
        // show() method inside main class
        public void show()
        {
            // Print statement
            System.out.println("i am in anonymous class");
        }
    };
	public static void main(String[] args) {
        // Calling show() method inside main() method
        h.show();
	}
}
