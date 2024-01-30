package multithreading.com;

//join(long miliseconds) Method Example
//example - 15
public class ThreadUsingJoinMethod4 extends Thread {
	@Override
	public void run() {
		for(int i=1;i<=5;i++){    
			   try{    
			    Thread.sleep(500);    
			   }catch(Exception e){System.out.println(e);}    
			  System.out.println(i);  
		}
	}
	public static void main(String[] args) {
		ThreadUsingJoinMethod4 t1=new ThreadUsingJoinMethod4();    
		ThreadUsingJoinMethod4 t2=new ThreadUsingJoinMethod4();    
		ThreadUsingJoinMethod4 t3=new ThreadUsingJoinMethod4();    
		 t1.start();    
		 try{    
		  t1.join(1500);    
		 }catch(Exception e){System.out.println(e);}    
		    
		 t2.start();    
		 t3.start();    
	}
}
