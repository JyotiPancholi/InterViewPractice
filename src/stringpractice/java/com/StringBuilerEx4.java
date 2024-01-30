//4) StringBuilder delete() method

package stringpractice.java.com;

public class StringBuilerEx4 {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("Hello");  
		sb.delete(1,3);  
		System.out.println(sb);//prints Hlo  
	}

}
