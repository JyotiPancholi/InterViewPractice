package patterns.forloop.com;

public class Pattern64 {

	public static void main(String[] args) {
		int temp = 1;
		System.out.println("0");
		for (int i = 1; i <=5; i++) {
			for (int j = 5; j >i; j--) {
				System.out.print(" ");
			}
			System.out.print("0 ");
			for (int j = 1; j <=i; j++) {
				System.out.print(temp+" ");
				temp++;
			}System.out.print("0");
			System.out.println();
		}
	}

}
