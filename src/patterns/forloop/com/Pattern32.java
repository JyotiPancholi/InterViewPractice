package patterns.forloop.com;

public class Pattern32 {

	public static void main(String[] args) {
		int alpha = 65;
		for (int i = 1; i<=5; i++) {
			for (int j = 5; j >=i; j--) {
				System.out.print((char)(alpha+j-1)+" ");
			}System.out.println();
		}
		for (int i = 4; i >=1; i--) {
			for (int j = 5; j >=i; j--) {
				System.out.print((char)(alpha+j-1)+" ");
			}System.out.println();
		}
	}
}
