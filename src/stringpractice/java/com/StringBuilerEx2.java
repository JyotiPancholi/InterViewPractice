//2) StringBuilder insert() method

package stringpractice.java.com;

public class StringBuilerEx2 {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("Hello ");  
		sb.insert(1,"Java");//now original string is changed  
		System.out.println(sb);//prints HJavaello  
	}

}
