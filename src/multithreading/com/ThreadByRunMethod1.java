package multithreading.com;
//https://www.javatpoint.com/what-if-we-call-java-run-method-directly
//example -11
public class ThreadByRunMethod1  extends Thread{
     @Override
    public void run() {
    	 for (int i = 1; i < 6; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
                System.out.println(e);
			}System.out.println(i);
		}
     }
	public static void main(String[] args) {
//		ThreadByRunMethod1 t1 =new ThreadByRunMethod1();
//		t1.start();
//		ThreadByRunMethod1 t2 =new ThreadByRunMethod1();
//		t2.start();
		
		ThreadByRunMethod1 t1 =new ThreadByRunMethod1();
		t1.run();
		ThreadByRunMethod1 t2 =new ThreadByRunMethod1();
		t2.run();
		
	}
}
