package patterns.forloop.com;

public class Pattern20 {

	public static void main(String[] args) {
		int alpha = 65,j;
		for (int i = 1; i <=5; i++) {
			for ( j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k<=i;k++) {
				System.out.print((char)(alpha+k-1)+" ");
			}System.out.println();
		}
	}
}
