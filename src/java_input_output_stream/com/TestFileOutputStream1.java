package java_input_output_stream.com;

import java.io.FileOutputStream;

public class TestFileOutputStream1 {

	public static void main(String[] args) {
		FileOutputStream f = null;
		String data = "This is demo of flush method";
		try {
			f = new FileOutputStream("G:\\IODemo\\flush.txt");
			f.write(data.getBytes());
			f.flush();
			f.close();
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
}
