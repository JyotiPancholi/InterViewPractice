package controlstatement.java.com;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Quantity : "+(n = sc.nextInt()));
		if((n*100)==1000) 
		{
			System.out.println("you get a discount of "+(.1*n*100)+" your total cost is : "+(n*100-(.1*n*100)));
		}else {
			System.out.println("no discount");
		}
	}

}
