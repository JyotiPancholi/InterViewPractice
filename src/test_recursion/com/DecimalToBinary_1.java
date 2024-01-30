package test_recursion.com;
//https://www.java67.com/2021/07/recursion-programming-exercises-in-java.html
import java.util.Scanner;

public class DecimalToBinary_1 {

	static void fun(int n) 
	{
		int i=0;
		int binary[]= new int[100];
		if (n>0) {
			binary[i++] =n%2;
			n = n/2;
			fun(n);
		}
		for (int j = i-1; j >=0; j--) {
			System.out.print(binary[j]);
		}
	}
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("enter the decimal number : ");
		int num = sc.nextInt();
		fun(num);
	}

}
