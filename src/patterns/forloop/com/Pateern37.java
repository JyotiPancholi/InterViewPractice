package patterns.forloop.com;

public class Pateern37 {

	public static void main(String[] args) {
		int alpha =65;
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print((char)(alpha)+" ");
				alpha++;
			}System.out.println();
		}
	}
}
