//3) StringBuilder replace() method

package stringpractice.java.com;

public class StringBuilerEx3 {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("Hello");  
		sb.replace(1,3,"Java");  
		System.out.println(sb);//prints HJavalo  
	}

}
