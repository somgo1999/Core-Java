package core.java.exceptionhandling;

public class FirstProgram {
	public static void main(String[] args) {
		System.out.println("Hello");
		System.err.println("Hello");
		System.out.println("Hello");
		try {
			double div = 15 / 0;
			System.out.println(div);
		} catch (ArithmeticException e) {
			System.err.println(e.getMessage());
			System.out.println(e.getMessage());
			System.out.println("Error");
			System.err.println("Error");
		}
	}
}
