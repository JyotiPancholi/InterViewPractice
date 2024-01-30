package patterns.forloop.com;

public class Pattern66 {

	public static void main(String[] args) {
		
		for(int i=1;i<=7;i++) 
		{
			for(int j=7;j>=i;j--)
				
				System.out.print(" ");
			
			for(int j=2;j<=(i*2);j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=4;i<=7;i++) 
		{
			for(int j=7;j>=i;j--)
				
				System.out.print(" ");
			
			for(int j=2;j<=(i*2);j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=4;i<=7;i++) 
		{
			for(int j=7;j>=i;j--)
				
				System.out.print(" ");
		
			
			for(int j=2;j<=(i*2);j++)
			{
				System.out.print("*");
			}
			System.out.println();
				}
		
		
		
		for(int i=3;i<=7;i++) 
		{
			for(int j=6;j>=1;j--)
				
				System.out.print(" ");
			for(int j=1;j<=3;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
			
				
				for(int p=1;p>=5;p++)
				{
					for (int j=1;j<=5;j++)
						{
						System.out.print(" ");
						}
				
				
				for(int j=1;j<=p;j++)
				{
					System.out.print("*");
				}
				System.out.println();
			
				}
		
	}
}
