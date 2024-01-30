package java_array.com;
//Java Program to print Odd and Even Numbers from an Array
public class ArrayExercise24 {

	public static void main(String[] args) {
		int arr[] =  {1,2,3,4,5,6,7};
		System.out.println("Odd Numbers:");  
		for (int i = 0; i < arr.length; i++) {
		if (arr[i]%2!=0) {
			System.out.print(arr[i]+"  ");
		}	
		}System.out.println();
		System.out.println("Even Numbers:");  
		for (int i = 0; i < arr.length; i++) {
		if (arr[i]%2==0) {
			System.out.print(arr[i]+"  ");
		}	
		}
	}
}
