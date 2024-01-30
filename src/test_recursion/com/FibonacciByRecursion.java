package test_recursion.com;

public class FibonacciByRecursion {
	 static int a=0 , b=1,c;
	 void testFibonacci(int n) 
	 { 
		 if (n>=1) {
			 c=a+b;
			 System.out.println(" "+c);
			 a=b;
			 b=c;
		   testFibonacci(n-1);			
		}
	 }
	public static void main(String[] args) {
		System.out.println(a+"  "+b);
		FibonacciByRecursion f = new FibonacciByRecursion();
		f.testFibonacci(10);
	}

}
