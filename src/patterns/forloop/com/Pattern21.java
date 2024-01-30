package patterns.forloop.com;

public class Pattern21 {

	public static void main(String[] args) {
		for (int i = 1; i <= 15; i++) {
			for (int j = 5; j >=i; j--) {
				System.out.print(i+" ");
			}System.out.println();
		}
	}
}
