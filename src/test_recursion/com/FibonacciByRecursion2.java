package test_recursion.com;

import java.util.Scanner;

//program to print nth tern of series
/*
 
public class FibonacciByRecursion2 {
 int fib(int n) 
 {
	 if (n==0) {
		return 0;
	}
	 else if (n==1) {
		return 1;
	}
	 else {
		return fib(n-1)+fib(n-2);
	}
 }
	public static void main(String[] args) {
		FibonacciByRecursion2 f2 =  new FibonacciByRecursion2();
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the limit :");
		int l = sc.nextInt();
		System.out.println(f2.fib(l));
	}
}

*/

// progrm to print whole series 
public class FibonacciByRecursion2 {
	 int fib(int n) 
	 {
		 if (n==0 || n==1) {
			return n;
		 }
		 else {
			return fib(n-1)+fib(n-2);
		}
	 }
		public static void main(String[] args) {
			FibonacciByRecursion2 f2 =  new FibonacciByRecursion2();
			Scanner sc =new Scanner(System.in);
			System.out.println("enter the limit :");
			int l = sc.nextInt();
			System.out.println("your fabonacci series : ");
			for (int i = 0; i < l; i++) {
				System.out.print(f2.fib(i)+"  ");
			}
		}
	}