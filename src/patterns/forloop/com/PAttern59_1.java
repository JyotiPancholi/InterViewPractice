package patterns.forloop.com;

//incomplete
public class PAttern59_1 {

	public static void main(String[] args) {
		int count;
		for(int j=2;j<=50;j++)
		{
			count=0;
			for(int i=1;i<=j;i++)
			{
			  if(j%i==0)
			  {
				 count++;        
			  }
			}
      if(count==2)
    System.out.print(j+"  ");     
    }
  }
}

