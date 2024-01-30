//Example of StringTokenizer Class
//boolean hasMoreTokens()	It checks if there is more tokens available.

package stringpractice.java.com;

import java.util.StringTokenizer;

public class TestStringTokenizer1 {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("my name is khan"," ");  
	     while (st.hasMoreTokens()) {  
	         System.out.println(st.nextToken());  
	     }  
	}

}
