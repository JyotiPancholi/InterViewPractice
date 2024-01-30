package patterns.forloop.com;

public class Pattern12 {

	public static void main(String[] args) {
		int k;
		for (int i = 1; i <=5; i++) 
		{
			for (int j = 1; j <=i; j++) 
			{//k = 5; k > i ; k--
				System.out.print(" ");
			}
			for (k = 5; k >=i ; k--) 
			{//int j = 1; j <=i; j++
				System.out.print(k+" ");
			}System.out.println();
		}
	}

}
/* 
for (int i=1;i<=5;i++)
{
  for(j=1;j<=i;j++)
  {
	sout(" ")
  }
  for(k=5;i>=1;k--)
  {
  sout(k)
  }
}
*/




