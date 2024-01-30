package test_recursion.com;

import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

//Fibonacci Series in Java Using Recursion

public class TestFibonacciSeries {

	public static void main(String[] args) {
		System.out.println("enter number upto which fibonacci series has to be printed : ");
		 int number = new Scanner(System.in).nextInt();
		 System.out.println("fibonacci series upto "+number+" number is :  ");
		 for (int i = 1; i <= number; i++) {
			System.out.println(fibonacci2(i)+" ");
		}
	}

	public static int fibonacci1(int number) {	
		if (number==1 || number==2) {
				return 1;
			}
		 return fibonacci1(number-1) + fibonacci1(number -2);
	}
	
	public static int fibonacci2(int number) {
		if (number==1 || number==2) {
			return 1;
		}
		int fibo1=1, fibo2=1, fibonacci=1;
	for(int i=3 ;i<=number ;i++) 
	{
		fibonacci = fibo1 + fibo2; 
		fibo1 = fibo2;
		fibo2 = fibonacci;
	}
	return fibonacci; //Fibonacci number
  }
}
