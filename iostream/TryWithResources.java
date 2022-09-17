package core.java.iostream;

import java.io.FileReader;

public class TryWithResources {
	public static void main(String[] args) throws Exception {
		try (FileReader rf = new FileReader("C:/Users/somgo/OneDrive/Desktop/Read Write/Try With Resources.txt")) {
			int character = rf.read();
			while (character != -1) {
				System.out.print((char) character);
				character = rf.read();
				Thread.sleep(15);
			}
		}
	}
}
