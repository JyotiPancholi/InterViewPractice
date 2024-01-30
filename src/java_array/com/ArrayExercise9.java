package java_array.com;

//Program to print the largest element in an array
public class ArrayExercise9 {

	public static void main(String[] args) {
		int arr[] =  new int[] {19,107,458,12,98};
		System.out.println("the largest number among all elemnts of array is : ");
		int max=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>max) {
				max=arr[i];
			}			
		}System.out.println(max);
	}
}