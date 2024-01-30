package java_input_output_stream.com;

import java.io.FileOutputStream;

public class TestFileOutputStream {

	public static void main(String[] args) {
		String data = "This is a line of text inside the file.";
		try {
			FileOutputStream f =  new FileOutputStream("G:\\IODemo\\fileoutputstream.txt");
			byte[] array = data.getBytes();
			f.write(array);
			f.close();
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
}
