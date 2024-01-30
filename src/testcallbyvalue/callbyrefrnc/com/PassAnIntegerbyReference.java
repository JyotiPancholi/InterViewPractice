package testcallbyvalue.callbyrefrnc.com;
//To pass an integer by reference in Java, try the following code 
public class PassAnIntegerbyReference {

	 public static void display(int[] arr) {
	      arr[0] = arr[0] + 50;;
	   }
	public static void main(String[] args) {
		  int val = 50;
	      int[] myArr = { val };
	      display(myArr);
	      System.out.println(myArr[0]);
	}

}
