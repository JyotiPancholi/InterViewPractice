package java_input_output_stream.com;

import java.io.FileInputStream;

public class TestFileInputStream {

	public static void main(String[] args) {
		try {
	         FileInputStream input = new FileInputStream("G:\\IODemo\\input.txt");
	         input.skip(5);
	         System.out.println("Input stream after skipping 5 bytes:");
	         int i = input.read();
	         while (i != -1) {
	            System.out.print((char) i);
	            i = input.read();
	         }
	         input.close();
	      }
	      catch (Exception e) {
	         e.getStackTrace();
		}
	}
}
