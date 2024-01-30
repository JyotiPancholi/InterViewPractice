package testwrapperclass.java.com;

import java.util.ArrayList;

public class TestAutoboxing2 {

	public static void main(String[] args) {
		char ch ='c';
//		Autoboxing- primitive to Character object conversion
		Character c = ch;
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(24);
		System.out.println(arrayList.get(0));
	}
}

/*
Note: Primitive types are more efficient than corresponding objects.
Hence, when efficiency is the requirement, it is always recommended 
primitive types.
*/