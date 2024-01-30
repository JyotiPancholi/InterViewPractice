package patterns.forloop.com;

public class Pattern49 {

		public static void main(String[] args) {
			int k=6;
			for (int i = 0; i <=5; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print(j+" ");
				}
				System.out.println(k);
				System.out.println();
			}
		}
}
