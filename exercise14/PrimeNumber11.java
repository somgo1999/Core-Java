package core.java.exercise14;

public class PrimeNumber11 {
	public static void main(String[] agrs) {
		int num = 99;
		int count = 0;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 0) {
			System.out.println("The given number is  an Prime Number");
		} else {
			System.out.println("The given number is not an Prime Number");
		}
	}
}