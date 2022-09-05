package core.java.exercise14;

public class FibonacciSeries6 {
	public static void main(String[] agrs) {
		int a = 0;
		int b = 1;
		int c = b;
		for (a = 0; a < 100; a++) {
			c = a + b;
			a = b;
			System.out.println(a + " " + b);
		}
	}
}
