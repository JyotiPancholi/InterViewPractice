package java_array.com;
//Java Program to sort the elements of an array in descending order
public class ArrayExercise15 {

	public static void main(String[] args) {
		int arr[] = new int[] {12,34,2,4,56,89,13,73};
		int temp=0;
		System.out.println("original array");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"  ");
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}System.out.println();
		System.out.println("elemnets after arranging in descending ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"  ");
		}
	}
}
