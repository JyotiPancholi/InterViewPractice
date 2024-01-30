//Write a Java program to find the number of days in a month

package controlstatement.java.com;

import java.util.Scanner;

public class IfElseEx5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int days_count = 0; 
        String MonthName = "Unknown";

        System.out.print("Input a month number: ");
        int month = sc.nextInt();

        System.out.print("Input a year: ");
        int year = sc.nextInt();
        
        switch(month)
        {
        case 1:
        	MonthName = "January";
        	days_count = 31;
        	break;
        case 2:
        	MonthName = "February";
        	if((year%400==0) || (year%4==0) && (year%100!=0)) 
        	{
        		days_count  = 29;
            } else {
            	days_count = 28;
            }
        	break;
        case 3:
        	MonthName = "march";
        	days_count = 31;
        	break;
        case 4:
        	MonthName = "april";
        	days_count = 30;
        	break;
        case 5:
        	MonthName = "may";
        	days_count = 31;
        	break;
        case 6:
        	MonthName = "June";
        	days_count = 30;
        	break;
        case 7:
        	MonthName = "July";
        	days_count = 31;
        	break;
        case 8:
        	MonthName = "august";
        	days_count = 31;
        	break;
        case 9:
        	MonthName = "september";
        	days_count = 30;
        	break;
        case 10:
        	MonthName = "october";
        	days_count = 31;
        	break;
        case 11:
        	MonthName = "november";
        	days_count = 30;
        	break;
        case 12:
        	MonthName = "december";
        	days_count = 31;
        	break;
        } System.out.print(MonthName + " " + year + " has " + days_count + " days\n");
		
	}

}
