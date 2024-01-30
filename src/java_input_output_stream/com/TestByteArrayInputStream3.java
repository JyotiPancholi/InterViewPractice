package java_input_output_stream.com;

import java.io.ByteArrayInputStream;

public class TestByteArrayInputStream3 {
	public static void main(String[] args) {
		byte[] array = {1,2,3,4,5};
		try {
			ByteArrayInputStream b = new ByteArrayInputStream(array);
			b.skip(2);
			System.out.println("input stream after skipping two bytes : ");
			int data = b.read();
			while (data!= -1) {
			System.out.print(data+" , ");
			data =  b.read();
			}
			b.close();
		} catch (Exception e) {
			e.getStackTrace();		
			
		}
	}
}
