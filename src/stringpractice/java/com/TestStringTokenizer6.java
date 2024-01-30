//Example of countTokens() method of the StringTokenizer class
package stringpractice.java.com;

import java.util.StringTokenizer;

public class TestStringTokenizer6 {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("Hello Everyone Have a nice day"," ");    
        /* Prints the number of tokens present in the String */  
        System.out.println("Total number of Tokens: "+st.countTokens());    
	}
}
