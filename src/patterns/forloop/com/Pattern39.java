package patterns.forloop.com;

public class Pattern39 {

	public static void main(String[] args) {
		for (int i = 1; i <=5; i++) {
			for (int j = 5; j >i; j--) {
				System.out.print(" ");
			}
			int var = 1;
			for (int k=1 ;k<=i;k++) {
				System.out.print(var+ " ");
				var = var*(i-k)/(k);
			}System.out.println();
		}
	}
}
