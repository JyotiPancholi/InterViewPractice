package java_array.com;
//Java Program to find Second Smallest Number in an Array
public class ArrayExercise19 {
public static int getSecondSmallest(int arr[],int total) 
{
	int temp;
	for (int i = 0; i <total; i++) {
		for (int j = i+1; j <total; j++) {
			temp= arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
	return arr[1];//2nd element because index starts from 0
	
}
	public static void main(String[] args) {
		int a[]={1,2,5,6,3,2};  
		int b[]={44,66,99,77,33,22,55};  
		System.out.println("second smallest element of  array a :"+getSecondSmallest(a, 6));
		System.out.println("second smallest element of  array b :"+getSecondSmallest(b, 7));
	}
}
