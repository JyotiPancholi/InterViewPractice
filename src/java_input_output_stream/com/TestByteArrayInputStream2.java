package java_input_output_stream.com;

import java.io.ByteArrayInputStream;

public class TestByteArrayInputStream2 {

	public static void main(String[] args) {
		byte[] array =  {1,2,3,4,5};
		try {
			ByteArrayInputStream b = new ByteArrayInputStream(array);
			System.out.println("available bytes at the beginning :"+b.available());
			b.read();
			b.read();
            System.out.println("Available bytes at the end: " + b.available());
			b.close();
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
}
