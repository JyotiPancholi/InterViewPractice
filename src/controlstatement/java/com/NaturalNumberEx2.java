package controlstatement.java.com;

import java.util.Scanner;

public class NaturalNumberEx2 {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number :- ");
		int nn = sc.nextInt();
		
		for(int i=1;i<=nn;i++)
		{
			System.out.println(i);
			sum+=i;
		}
		System.out.println("sum of all natural numbers are : "+sum);
	}
}
