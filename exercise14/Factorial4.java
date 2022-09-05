package core.java.exercise14;

public class Factorial4 {
	public static void main(String[] agrs) {
		int number = 10;
		int i;
		int factorial = 1;
		for (i = 1; i <= number; i++) {
			factorial = factorial * i;
		}
		System.out.println("Factorial = " + factorial);
	}
}
