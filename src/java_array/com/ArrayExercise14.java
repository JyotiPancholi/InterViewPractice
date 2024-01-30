package java_array.com;

//Java Program to sort the elements of an array in ascending orderm8n7b5V

public class ArrayExercise14 {

	public static void main(String[] args) {
		int arr[] = new int[] {2,4,3,7,8,6};
		int temp=0;
		System.out.println("original elements of array :");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"  ");
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("elements of array after arranging in ascending order :");	
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"  ");
		}
	}
}
