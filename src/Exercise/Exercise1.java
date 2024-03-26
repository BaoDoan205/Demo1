package Exercise;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Exercise1 {

	public static void main(String[] args) throws IOException {
		ByteArrayOutputStream outStream = new ByteArrayOutputStream();
		String s = "This is a test.";
		for (int i = 0; i < s.length(); i++)
			outStream.write(s.charAt(i));
		System.out.println("outstream: " + outStream);
		System.out.println("Size: " + outStream.size());
		ByteArrayInputStream inStraem = new ByteArrayInputStream(outStream.toByteArray());
		int inBytes = inStraem.available();
		System.out.println("inStream has " + inBytes + "availbe bytes");
		byte inBuf[] = new byte[inBytes];
		int bytesRead = inStraem.read(inBuf, 0, inBytes);
		System.out.println(bytesRead + " bytes were read");
		System.out.println("They are: " + new String(inBuf));
	}
}
