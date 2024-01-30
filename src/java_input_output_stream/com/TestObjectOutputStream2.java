package java_input_output_stream.com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog1 implements Serializable {

    String name;
    String breed;

    public Dog1(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
}
public class TestObjectOutputStream2 {

	public static void main(String[] args) {
		Dog1 d1 =  new Dog1("Dezzy","Labrador");
		try {
			FileOutputStream fos = new FileOutputStream("G:\\IODemo\\TestObjectOutputStream2.txt");
			ObjectOutputStream oos =  new ObjectOutputStream(fos);
			oos.writeObject(d1);
			FileInputStream fis = new FileInputStream("G:\\IODemo\\TestObjectOutputStream2.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Dog1 d2 = (Dog1)ois.readObject();
			System.out.println("dogs name is :"+d2.name);
			System.out.println("dogs breed is : "+d2.breed);
			oos.close();
			ois.close();
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
}
