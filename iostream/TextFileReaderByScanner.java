package core.java.iostream;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TextFileReaderByScanner {
	public static void main(String[] args) throws IOException {
		FileReader file = new FileReader("C:/Users/somgo/OneDrive/Desktop/Read Write/Text File Reader By Scanner.txt");
		Scanner scan = new Scanner(file);
		while (scan.hasNext()) {
			System.out.println(scan.nextLine());
		}
		scan.close();
		file.close();
	}
}
