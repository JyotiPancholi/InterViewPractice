package oprerators.com;
import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of x :- ");
		int x = sc.nextInt();
		System.out.println("enter the value of y :- ");
		int y = sc.nextInt();
		int max = x > y ? x : y;
		System.out.println("greater amoung x and y is " +max);
	}
}
