//https://www.geeksforgeeks.org/enum-in-java/
//incomplete

package enumerators.java.com;
public enum Colors {
RED,
BLUE,
GREEN;
}
class OtherMethodsInEnum{
	public static void main(String[] args) {
		Colors ar[] = Colors.values(); 
		for (Colors cols : ar) {
			System.out.println(cols+" at index = "+cols.ordinal());
		}System.out.println(Colors.valueOf("RED"));
	}
}

