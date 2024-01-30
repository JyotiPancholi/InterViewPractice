package java_array.com;
//ex-1
public class TestArray1 {

	public static void main(String[] args) {
		int arr[]= new int[5];
		arr[0] = 10;
		arr[1] = 23;
		arr[2] = 45;
		arr[3] = 34;
		arr[4] = 67;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
