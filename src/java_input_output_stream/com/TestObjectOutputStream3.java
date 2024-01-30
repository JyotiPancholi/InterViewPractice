package java_input_output_stream.com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dogs implements Serializable {

    String name;
    String breed;

    public Dogs(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
}
public class TestObjectOutputStream3 {

	public static void main(String[] args) {
        Dogs dog1 = new Dogs("Tyson", "Labrador");

        try {
            FileOutputStream fileOut = new FileOutputStream("file.txt");
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
            objOut.writeObject(dog1);
            FileInputStream fileIn = new FileInputStream("file.txt");
            ObjectInputStream objIn = new ObjectInputStream(fileIn);
            Dogs newDog = (Dogs) objIn.readObject();
            System.out.println("Dog Name: " + newDog.name);
            System.out.println("Dog Breed: " + newDog.breed);
            objOut.close();
            objIn.close();
        }
        catch (Exception e) {
            e.getStackTrace();
        }
	}

}
