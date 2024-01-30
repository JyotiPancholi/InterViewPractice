package controlstatement.java.com;

public class ForLoopEx1 {

	public static void main(String[] args) {
		int sum = 0,i,j;
		for(i=0,j=0;i<5 & j<5;++i,j=i+1) {
			sum+=i;
			System.out.println("value of sum :"+sum);
        }
	  System.out.println(j);
      System.out.println(i);
	}
}
