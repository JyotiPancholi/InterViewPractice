package patterns.forloop.com;

public class Pattern44 {

	public static void main(String[] args) {
		int l= 1;
		for (int i = 1; i <=5; i++) {
			for (int j = 5; j>i; j--) {
				System.out.print(l+" ");
			}
			for (int k = i; k >=1; k--) 
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
