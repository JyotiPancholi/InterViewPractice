package multithreading.com;

//Example of the sleep() Method in Java: When the sleeping time is -ive
//Example - 8
public class TestSleepMethod2 {

	public static void main(String[] args) // throws InterruptedException 
	{
		try {
			for (int i = 1; i < 5; i++) {
				// it throws the exception IllegalArgumentException  
				// as the time is -ive which is -100  
				Thread.sleep(-100);
				System.out.println(i);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

//   o/p = java.lang.IllegalArgumentException: timeout value is negative
