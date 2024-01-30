package multithreading.com;
//Example - 14
public class ThreadUsingJoinMethod3 extends Thread{
	public void run(){    
		  for(int i=1;i<=5;i++){    
		   try{    
		    Thread.sleep(500);    
		   }catch(Exception e){System.out.println(e);}    
		  System.out.println(i);    
		  }    
		 }    
	public static void main(String[] args) {
		ThreadUsingJoinMethod3 t1 = new ThreadUsingJoinMethod3();
		ThreadUsingJoinMethod3 t2 = new ThreadUsingJoinMethod3();
		ThreadUsingJoinMethod3 t3 = new ThreadUsingJoinMethod3();
		t1.start();    
		 try{    
		  t1.join();    
		 }catch(Exception e){System.out.println(e);}    
		    
		 t2.start();    
		 t3.start();    
	}
}
