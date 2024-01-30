package oprerators.com;

import java.util.Scanner;

public class UnaryPrePost {
//++x,x++,--x,x--,~,!
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");
		int n = sc.nextInt();
		System.out.println(n++);
		System.out.println(++n);
		System.out.println(n--);
		System.out.println(--n);
		System.out.println(~n);
		System.out.println(n);
		System.out.println(n++ - ++n + n-- + --n);
		System.out.println(n);
		try {
		System.out.println("enter value of x in boolean");
		boolean x= sc.nextBoolean();
		System.out.println(!x);
		
		} catch (Exception e) {
		 System.out.println("wrong input found");
		}
	}
}
