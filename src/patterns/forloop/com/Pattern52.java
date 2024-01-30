package patterns.forloop.com;

public class Pattern52 {

	public static void main(String[] args) {
		for (int i = 1; i <=5; i++) {
			if (i%2==1) 
				for (int j = 1; j <=5; j++) 
				   {
					System.out.print(j+" ");
				   }
			else 
				for (int k = 1; k <=5; k++) 
				   {
					System.out.print("* ");
				   }
			System.out.println();
			}
		}
	}

