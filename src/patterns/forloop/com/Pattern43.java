package patterns.forloop.com;

public class Pattern43 {

	public static void main(String[] args) {
		int k=0;
		for (int i = 1; i <=5 ; i++) {
			for (int j = 1; j <=5; j++) {
				if(i==j)
				{
					System.out.print(j+" ");
				}
				else
				{
					System.out.print(k+" ");
				}
			}System.out.println();
		}
	}
}
