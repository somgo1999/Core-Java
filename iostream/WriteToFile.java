package core.java.iostream;

import java.io.FileWriter;

import java.io.IOException;

public class WriteToFile {
	public static void main(String[] args) throws IOException {
		FileWriter out = new FileWriter("C:/Users/somgo/OneDrive/Desktop/New Text Document Demo.txt");
		out.write("My name is Khan");
		out.write("\n");
		out.write("\n");
		out.write("I am not a terrorist");
		out.close();
		System.out.println("Done");// FileWriter creates an new file and overrides the old file, so the file
									// becomes blank
	}
}
