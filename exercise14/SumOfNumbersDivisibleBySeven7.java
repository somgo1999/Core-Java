package core.java.exercise14;

public class SumOfNumbersDivisibleBySeven7 {
	public static void main(String[] agrs) {
		int i;
		int sum = 0;
		for (i = 100; i < 200; i++) {
			if (i % 7 == 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}
}
