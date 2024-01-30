//Write a program in Java to display the cube of the number upto given an integer.
package controlstatement.java.com;

import java.util.Scanner;

public class CubeUptoGivnNumver {

	public static void main(String[] args) {
		int cube;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to print cube");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) 
		{
			System.out.println("cube of "+i+" = "+i*i*i);
		}
	}

}
