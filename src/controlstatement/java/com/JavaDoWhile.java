package controlstatement.java.com;

import java.util.Scanner;

public class JavaDoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number, how many times you want to execute the statement upto that .. ");
		int n = sc.nextInt();
		int i=1;
		do {
		System.out.println("java do while loop : "+i);	
		i++;
		}
		while(i<=n);
	}

}
