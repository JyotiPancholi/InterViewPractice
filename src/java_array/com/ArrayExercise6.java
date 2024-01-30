package java_array.com;
//Program to print the elements of an array present on even position
public class ArrayExercise6 {

	public static void main(String[] args) {
		int arr[]  =new int[] {1,3,4,5,6,7};
		System.out.println("Elements of given array present on even position: ");  
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2==0) {
				System.out.println(arr[i]);
			}
	}
//		"OR"
		
//		for (int i = 1; i < arr.length; i=i+2) {
//			System.out.println(arr[i]);
//		}
		
	}
}
