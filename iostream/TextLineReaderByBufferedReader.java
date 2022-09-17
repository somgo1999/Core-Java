package core.java.iostream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextLineReaderByBufferedReader {
	public static void main(String[] args) throws IOException {
		FileReader file = new FileReader("C:/Users/somgo/OneDrive/Desktop/Read Write/Text Line Reader By Buffered Reader.txt");
		BufferedReader br = new BufferedReader(file);
		String line = br.readLine();
		while (line != null) {
			System.out.println(line);
			line = br.readLine();
		}
		br.close();
		file.close();
	}
}
