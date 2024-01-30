package unicode.java.com;

import java.io.UTFDataFormatException;

public class TestUnicode {

	public static void main(String[] args) throws Exception {
		String st = "Unicode System\u00A9"; 
		byte[] charset = st.getBytes("UTF-8");
		String newstr = new String(charset , "UTF-8");
		System.out.println(newstr); 
	}

}
