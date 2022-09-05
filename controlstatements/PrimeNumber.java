package core.java.controlstatements;

public class PrimeNumber {
	public static void main(String[] agrs) {
		int num = 1011;
		int count = 0;
		int i;
		for (i = 2; num > i; i++) {
			if (num % i == 0) {
				System.out.println("Not a prime number" + i);
				count++;
				//break;
			}
		}
		if (count == 0) {
			System.out.println("Prime number" + i );
		}

	}
}