package java_input_output_stream.com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestObjectOutputStream1 {

	public static void main(String[] args) {
		int data1 = 56789;
		String data2  = "hiie this is jiya ! how  are you ?";
		try {
			FileOutputStream fos = new FileOutputStream("G:\\IODemo\\TestObjectOutputStream1.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeInt(data1);
			oos.writeObject(data2);
			FileInputStream fis = new FileInputStream("G:\\IODemo\\TestObjectOutputStream1.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			System.out.println("integer data is : "+ois.readInt());
			System.out.println("String data is : "+ois.readObject());
			oos.close();
			ois.close();
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
}
