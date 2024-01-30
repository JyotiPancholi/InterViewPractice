package testwrapperclass.java.com;

import java.util.ArrayList;

public class TestUnboxing2 {

	public static void main(String[] args) {
		Character c =  'c';
		char ch = c;
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(67);
		int num = a.get(0);
		System.out.println(num);
	}
}
