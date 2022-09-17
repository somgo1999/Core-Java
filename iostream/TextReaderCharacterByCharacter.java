package core.java.iostream;

import java.io.FileReader;
import java.io.IOException;

public class TextReaderCharacterByCharacter extends Thread {
	public static void main(String[] args) throws IOException, Exception {
		FileReader reader = new FileReader(
				"C:/Users/somgo/OneDrive/Desktop/Read Write/Text Reader Character By Character.txt");
		int ch = reader.read();
		while (ch != -1) {
			System.out.print((char) ch);
			ch = reader.read();
			Thread.sleep(150);
		}
		reader.close();
	}
}
