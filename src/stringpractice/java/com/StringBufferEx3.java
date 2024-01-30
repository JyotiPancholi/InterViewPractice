//3) StringBuffer replace() Method

package stringpractice.java.com;

public class StringBufferEx3 {

	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("Hello all ! ");
		str.replace(1, 3, "java");
		System.out.println(str);
		
	}

}
