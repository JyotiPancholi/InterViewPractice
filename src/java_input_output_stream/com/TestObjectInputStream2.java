package java_input_output_stream.com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable {

    String name;
    String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
}
public class TestObjectInputStream2 {
	public static void main(String[] args) {
		Dog d1 =  new Dog("kaaliya", "Labrador");
		try {
			FileOutputStream fos = new FileOutputStream("G:\\IODemo\\TestObjectInputStream2.txt");
			ObjectOutputStream oos =  new ObjectOutputStream(fos);
			oos.writeObject(d1);
			FileInputStream fis = new FileInputStream("G:\\IODemo\\TestObjectInputStream2.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Dog d2 = (Dog)ois.readObject();
			System.out.println("Dogs name : "+d2.name);
			System.out.println("Dogs breed : "+d2.breed);
			oos.close();
			ois.close();
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
}
