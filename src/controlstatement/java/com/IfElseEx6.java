package controlstatement.java.com;

import java.util.Scanner;

public class IfElseEx6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter any alphabet : ");
		String latter = sc.next().toLowerCase();
		
		 boolean uppercase = latter.charAt(0) >= 65 && latter.charAt(0) <= 90;
	     boolean lowercase = latter.charAt(0) >= 97 && latter.charAt(0) <= 122;
	     boolean vowels = latter.equals("a") || latter.equals("e") || latter.equals("i")
	                || latter.equals("o") || latter.equals("u");
	     
	     if(latter.length()>1) 
	     {
	    	 System.out.println("error : Not a single charactor !");
	     }
	     else if(!(uppercase || lowercase)) 
	     {
	    	 System.out.println("Error. Not a letter. Enter uppercase or lowercase letter.");
	     }
	     else if(vowels)
	     {
	    	 System.out.println("given alphabet is a vowel");
	     }
	     else
	        {
	            System.out.println("Input letter is Consonant");
	        }
      }
}
