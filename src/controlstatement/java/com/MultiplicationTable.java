//Write a program in Java to display the multiplication table of a given integer.

package controlstatement.java.com;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("enter any number to show Multiplication table ");
		int n = sc.nextInt();
		for(int i=1;i<=10;i++) 
		{
			System.out.println(n*i);
		}
	}

}
