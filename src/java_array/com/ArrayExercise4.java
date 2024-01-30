package java_array.com;

//Program to print the duplicate elements of an array
public class ArrayExercise4 {

	public static void main(String[] args) {
		int arr[] = new int[]{1, 2, 3, 4, 2, 7, 8, 8, 3};
		System.out.println("Duplicate elements in given array:");
		for (int i = 0; i < arr.length; i++) {//0,1
			for (int j = i+1; j < arr.length; j++) {//2,3,4
				if (arr[i]==arr[j]) {
//					System.out.println(arr[i]);
					System.out.println(arr[j]);//2
				}
			}
		}
	}
}
