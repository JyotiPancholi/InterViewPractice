package testabstract.com;

//https://www.geeksforgeeks.org/functional-interfaces-java/
public class functionalInterface {

	public static void main(String[] args) {
		 // create anonymous inner class object
        new Thread(new Runnable() {
            @Override public void run()
            {
                System.out.println("New thread created");
            }
        }).start();
	}

}
