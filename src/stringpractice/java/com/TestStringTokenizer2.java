//String nextToken(String delim)	It returns the next token based on the delimiter.

package stringpractice.java.com;

import java.util.StringTokenizer;

public class TestStringTokenizer2 {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("my,name,is,khan");  
	      // printing next token  
	      System.out.println("Next token is : " + st.nextToken(","));  
	
	}

}
