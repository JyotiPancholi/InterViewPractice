package multithreading.com;
//Example -19
public class Threadpriority1 extends Thread{
	@Override
	public void run() {
		System.out.println("inside the run method ..!");
	}
	public static void main(String[] args) {
		Threadpriority1 t1 =  new Threadpriority1();
		Threadpriority1 t2 =  new Threadpriority1();
		Threadpriority1 t3 =  new Threadpriority1();
		System.out.println("priority of the thread t1 is  : "+t1.getPriority());
		System.out.println("priority of the thread t2 is  : "+t2.getPriority());
		System.out.println("priority of the thread t3 is  : "+t3.getPriority());
		t1.setPriority(6);
		t2.setPriority(3);
		t3.setPriority(9);
		System.out.println("new priority of the thread t1 is  : "+t1.getPriority());
		System.out.println("new priority of the thread t2 is  : "+t2.getPriority());
		System.out.println("new priority of the thread t3 is  : "+t3.getPriority());
		
		System.out.println("current executing thread : "+Thread.currentThread().getName());
		System.out.println("priority of the main thtread is : "+Thread.currentThread().getPriority());
		
		Thread.currentThread().setPriority(10);
		System.out.println("new priority after final setting : "+Thread.currentThread().getPriority());
	}
}
