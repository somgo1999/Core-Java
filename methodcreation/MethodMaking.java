package core.java.methodcreation;
public class MethodMaking {
	public void max(int a, int b) {
		if (a > b) {
			System.out.println("a is greater than b");
		} else {
			System.out.println("b is greater than a");
		}
	}
	public void min(int a, int b) {
		if (a < b) {
			System.out.println("a is smaller than b");
		} else {
			System.out.println("b is smaller than a");
		}
	}

	public int sum(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public int subtraction(int a, int b) {
		int subtraction = a - b;
		return subtraction;
	}

	public int multiplication(int a, int b) {
		int multiplication = a * b;
		return multiplication;
	}

	public double division(double a, double b) {
		double division = a / b;
		return division;
	}
}
