//4) StringBuffer delete() Method

package stringpractice.java.com;

public class StringBufferEx4 {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Hello");  
		sb.delete(1,3);  
		System.out.println(sb);//prints Hlo  
	}

}