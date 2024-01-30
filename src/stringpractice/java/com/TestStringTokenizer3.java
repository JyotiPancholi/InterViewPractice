//boolean hasMoreElements()	It is the same as hasMoreTokens() method.
package stringpractice.java.com;

import java.util.StringTokenizer;

public class TestStringTokenizer3 {
	 public static void main(String args[])  
	 {    
	   /* StringTokenizer object */  
	   StringTokenizer st = new StringTokenizer("Demonstrating methods from StringTokenizer class"," ");    
	     /* Checks if the String has any more tokens */  
	     while (st.hasMoreTokens())   
	     {    
	         System.out.println(st.nextToken());    
	     }
	 }
}
