package java_input_output_stream.com;

import java.io.ByteArrayOutputStream;

public class TestByteArrayOutputStream2 {

	public static void main(String[] args) {
		String data  = "this is the line inside ByteArrayOutputStream.";
		try {
			ByteArrayOutputStream b =  new ByteArrayOutputStream();
			b.write(data.getBytes());
			byte[] a = b.toByteArray();
			System.out.print("data using toByteArray :");
			for (int i = 0; i < a.length; i++) {
		        System.out.print((char)a[i]);
			}
			String s =  b.toString();
			System.out.println("\nData using toString(): " +s);
			b.close();
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
}
