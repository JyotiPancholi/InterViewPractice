package controlstatement.java.com;

import java.util.Scanner;

public class FindPositiveNegativeNo {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter any number");
		int n = sc.nextInt();
		if(n<0)
		{
			System.out.println("this is a negative value");
		}
		else if(n>0)
		{
			System.out.println("this is a positive value");
		}
		else
		{
			System.out.println("number is 0");
		}
	}
}
