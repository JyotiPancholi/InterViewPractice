//Example of hasMoreElements() method of the StringTokenizer class

package stringpractice.java.com;

import java.util.StringTokenizer;

public class TestStringTokenizer4 {

	public static void main(String[] args) {
		 StringTokenizer st = new StringTokenizer("Hello everyone I am a Java developer"," ");    
	     while (st.hasMoreElements())   
	     {    
	         System.out.println(st.nextToken());    
	     }    
	}

}
