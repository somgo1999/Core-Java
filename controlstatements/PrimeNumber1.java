package core.java.controlstatements;

public class PrimeNumber1 {
	public static void main(String[] agrs) {
		int num = 200;
		int count = 0;
		int i;
		for (i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.println("num is not a prime number  " + i + "\t");
				count++;
				//break;
			}
		}
		if (count == 0) {
			System.out.println("num is a prime number");
		}
	}
}