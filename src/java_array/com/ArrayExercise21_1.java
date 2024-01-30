package java_array.com;

public class ArrayExercise21_1 {

	public static void main(String[] args) {
//     int arr[] = {12,23,45,23,44,56,67,12,45,45,44};
		int arr[] = {10,20,20,30,30,40,50,50};
     int j=0;
     int temp[] = new int[arr.length];
     for (int i = 0; i < arr.length-1; i++) {
		if(arr[i]!=arr[i+1])
			{
			temp[j]=arr[i];
			j++;
			}
	   }temp[j]=arr[arr.length-1];
	   for (int i = 0; i < temp.length; i++) {
		 System.out.print(temp[i]+"  ");
	    }
	}
}
