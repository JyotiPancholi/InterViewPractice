package java_array.com;
//ArrayIndexOutOfBoundsException
//ex-7

public class TestArrayException {

	public static void main(String[] args) {
		int arr[]= {12,45,53,67,86};
		for (int i = 0; i <= arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
