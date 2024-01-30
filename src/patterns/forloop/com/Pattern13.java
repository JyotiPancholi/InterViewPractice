package patterns.forloop.com;

public class Pattern13 {

	public static void main(String[] args) {
       int k;
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <5; j++) {
				System.out.print(" ");
			}
			for (k = 5; k >=i; k--) {
				System.out.print(k+" ");
			}System.out.println();
        }
	}
}
