package patterns.forloop.com;

public class Pattern60_1 {

	public static void main(String[] args) {
		int demo=1;
		int m=0;
		for (int i = 1; i <=5; i++) {
			for (int sp = 0; sp <5-i; sp++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=demo; j++) {
				if (j<=i) {
					m=m+1;
				} else {
					m=m-1;
				}
				System.out.print(m);
			}System.out.println();
			demo = demo+2;
		}
	}
}
