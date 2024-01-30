package java_input_output_stream.com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestObjectInputStream1 {

	public static void main(String[] args) {
		int x =  5;
		String s = "hiie this is jiya !";
		try {
			FileOutputStream fos = new FileOutputStream("G:\\IODemo\\TestObjectInputStream1.txt");
			ObjectOutputStream oos =  new ObjectOutputStream(fos);
			oos.writeInt(x);
			oos.writeObject(s);
			FileInputStream fis =  new FileInputStream("G:\\IODemo\\TestObjectInputStream1.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			System.out.println("integer data : "+ois.readInt());
			System.out.println("String data : "+ois.readObject());
			fos.close();
			fis.close();
} catch (Exception e) {
			e.getStackTrace();
		}
	}
}
