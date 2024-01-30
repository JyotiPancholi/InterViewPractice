package multithreading.com;
//https://www.javatpoint.com/how-to-create-a-thread-in-java
//3) Using the Thread Class: Thread(String Name)
//Example - 3
public class UsingThreadClass {

	public static void main(String[] args) {
		Thread t =  new Thread("Example using Thread class");
		// the start() method moves the thread to the active state  
		t.start();
		// getting the thread name by invoking the getName() method  
		String str =  t.getName();
		System.out.println(str);
	}
}
