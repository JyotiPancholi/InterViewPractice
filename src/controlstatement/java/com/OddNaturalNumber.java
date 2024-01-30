
package controlstatement.java.com;

import java.util.Scanner;

public class OddNaturalNumber {

	public static void main(String[] args) {
		int oddsum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number to find odd natural numbers with their sum : ");
		int n =sc.nextInt();
		
		for(int i=2;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println(" ");
			}else {
				System.out.println(i);
				oddsum+=i;
			}
		}
		System.out.println("sum of all odd nhumbers are "+oddsum);
	}

}
