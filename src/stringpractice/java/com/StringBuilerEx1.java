//1) StringBuilder append() method

package stringpractice.java.com;

public class StringBuilerEx1 {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("Hello ");  
		sb.append("Java");//now original string is changed  
		System.out.println(sb);//prints Hello Java  
	}

}
