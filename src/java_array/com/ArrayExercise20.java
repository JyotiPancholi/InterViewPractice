package java_array.com;

public class ArrayExercise20 {
public static int getTheSmallest(int []arr,int total) 
{
	int temp ;
	for (int i = 0; i < total; i++) {
		for (int j = i+1; j < total; j++) {
			if (arr[i]>arr[j]) {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			}
		}
	}
	return arr[0];
}
	public static void main(String[] args) {
		 int a[]= {5,5,3,5,2,5,7,82,4,7,9};
		 int b[]= {54,53,6,8,98,5,66,7,34,23,45,6,7,7,8};
		 System.out.println("the smallest element of array a :"+getTheSmallest(a,11));
		 System.out.println("the smallest element of array b :"+getTheSmallest(b, 15));
	}
}
