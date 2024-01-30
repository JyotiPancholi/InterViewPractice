package patterns.forloop.com;

public class Pattern58 {

	public static void main(String[] args) {
		int a=-1,b=1,c;
		for (int i = 1; i <=5 ; i++) {
			for (int j = 1; j<=i; j++) {
				c=a+b;
				System.out.print(c+" ");
				a=b;
				b=c;
			}System.out.println();
		}
	}
}
