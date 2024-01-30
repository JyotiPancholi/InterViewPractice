package controlstatement.java.com;

import java.util.Scanner;

import javax.print.attribute.standard.PrinterMessageFromOperator;

public class GreatestAmongThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first value \n");
		int a = sc.nextInt();
		System.out.println("enter first value \n");
		int b = sc.nextInt();
		System.out.println("enter first value \n");
		int c = sc.nextInt();
		if(a>b)
		{
			if(a>c)
			{
			System.out.println("\na is greater !");	
			}
			else
			{
			System.out.println("\nc is greatet !");
			}
		}
		else
		{
			if(b>c) 
			{
				System.out.println("\nb is greater !");
			}
			else
			{
				System.out.println("\nc is greater !");
			}
		}
	}
}
