package java_array.com;

public class ArrayExercise21_2 {

	public static void main(String[] args) {
		  int arr[] = {10,20,20,30,30,40,50,50};
	     int j=0;
	     for (int i = 0; i < arr.length-1; i++) {
			if(arr[i]!=arr[i+1])
				{
				arr[j]=arr[i];
				j++;
				}
		   }arr[j]=arr[arr.length-1];
//		   for (int i = 0; i < arr.length; i++) {
//			 System.out.print(arr[i]+"  ");
//		    }
		   for (int i = 0; i < j+1; i++) {
				 System.out.print(arr[i]+"  ");
			    }
		}
	}


