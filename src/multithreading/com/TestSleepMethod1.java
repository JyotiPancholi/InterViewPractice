package multithreading.com;

//Example of the sleep() Method in Java : on the main thread
//Example - 7
public class TestSleepMethod1 {

	public static void main(String[] args) {
		try {
			for (int i = 0; i < 5; i++) {
				Thread.sleep(1000);
				System.out.println(i);
		    	}
			}
		catch (InterruptedException e) {
			System.out.println(e);
		}
	}
}
