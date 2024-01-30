package patterns.forloop.com;

public class Pattern36 {

	public static void main(String[] args) {
		for (int i = 1; i <=5; i++) {//3
			for ( int j = 5; j >i; j--) {
				System.out.print("  ");
			}
			for (int k = 1; k <=i; k++) {
				System.out.print(k+" ");
			}
			for (int l = i-1; l >=1; l--) {
				System.out.print(l+" ");
			}
			System.out.println();
		}
	}
}


/*			for (int j=1;j<=i; j++) {
				if (j==1 || i==j ) {
					System.out.print(j+" ");
				} else {
					System.out.print(" ");
				}
			}
*/