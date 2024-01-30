package controlstatement.java.com;

import java.util.Scanner;

public class JavaWhileLoop{

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("enter number, how many times you want to execute the statement upto that .. ");
		int  n = sc.nextInt();
		int i=0;
		while(i<=n) {
			System.out.println("hello ! this is while loop :"+i);
			i++;
		}
	}
}
