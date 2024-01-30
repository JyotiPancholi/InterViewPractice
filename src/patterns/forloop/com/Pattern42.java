package patterns.forloop.com;

public class Pattern42 {

	public static void main(String[] args) {
		int alpha = 65;
		for (int i = 1; i <=5; i++) {
			for (int k = 5; k >i; k--) {
				System.out.print("  ");
			}
			for (int j = 1; j <=i; j++) {
				System.out.print((char)(alpha+j-1)+" ");
			}
			for (int l = i-1; l >=1; l--) {
				System.out.print((char)(alpha+l-1)+" ");
			}System.out.println();
		}
	}
}
