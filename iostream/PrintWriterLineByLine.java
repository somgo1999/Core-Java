package core.java.iostream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterLineByLine {
	public static void main(String[] args) throws Exception {
		FileWriter fw = new FileWriter("C:/Users/somgo/OneDrive/Desktop/Read Write/Print Writer Line By Line.txt");
		PrintWriter pw = new PrintWriter(fw);
		for (int i = 0; i <= 100; i++) {
			System.out.println("Hello " + i);
			Thread.sleep(150);
		}
		pw.close();
		fw.close();
		System.out.println("Check ------- C:/Users/somgo/OneDrive/Desktop/Read Write/Print Writer Line By Line.txt");
	}
}
