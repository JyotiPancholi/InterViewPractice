package java_input_output_stream.com;

import java.io.ByteArrayOutputStream;

public class TestByteArrayOutputStream1 {

	public static void main(String[] args) {
		String data ="this is the line inside ByteArrayOutputStream file.";
		try {
			ByteArrayOutputStream o = new ByteArrayOutputStream();
			byte[] array = data.getBytes();
			o.write(array);
			String s = o.toString();
			System.out.println("output stream : "+s);
			o.close();
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
}
