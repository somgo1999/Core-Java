package core.java.exceptionhandling;

public class SecondProgram {
	public static void main(String[] args) {
		try {
			String name = null;
			System.out.println(name.length());
		} catch (NullPointerException e) {
			System.err.println(e.getMessage());
			System.out.println("There was no String found");
		}
	}
}
