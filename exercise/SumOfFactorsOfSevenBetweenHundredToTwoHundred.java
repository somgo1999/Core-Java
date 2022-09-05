package core.java.exercise;

public class SumOfFactorsOfSevenBetweenHundredToTwoHundred {
	public static void main(String[] agrs) {
		int num = 200;
		int sum = 0;
		for (int i = 100; i <= num; i++) {
			if (i % 7 == 0) {
				sum = sum + i;
			System.out.println(i);
		}
		}
		System.out.println("Sum");
		System.out.println(sum);
	}
}
