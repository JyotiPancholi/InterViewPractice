//Write a Java program that keeps a number from the user and generates an integer 
//between 1 and 7 and displays the name of the weekday.

package controlstatement.java.com;

import java.util.Scanner;

public class WeekdayInputBySwitchCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter any number between 1 - 7");
		int n = sc.nextInt();
		
		System.out.println(getDayName(n));
	}
	
	public static String getDayName(int n) {
        String dayName = "";
		 switch(n) 
		 {
		 case 1:
			 System.out.println("Monday");
			 break;
		 case 2:
			 System.out.println("Tuesday");
			 break;
		 case 3:
			 System.out.println("Wednesday");
			 break;
		 case 4:
			 System.out.println("Thursday");
			 break;
		 case 5:
			 System.out.println("Friday");
			 break;
		 case 6:
			 System.out.println("Saturday");
			 break;
		 case 7:
			 System.out.println("Sunday");
			 break;
		 }
		return dayName;
	}

}
