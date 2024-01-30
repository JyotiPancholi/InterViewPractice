package controlstatement.java.com;

import java.util.Scanner;

public class JavaForLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number, how many times you want to execute the statement upto that .. ");
		int n = sc.nextInt();
		for(int i=0;i<=n;i++) {
			System.out.println("hello ! this is for loop :" +i);
		}
	}
}
