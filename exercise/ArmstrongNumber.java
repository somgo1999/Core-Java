package core.java.exercise;

public class ArmstrongNumber {
	public static void main(String[] agrs) {
		int num = 153;
		int n = num;
		int sum = 0;
		while (num != 0) {
			int m = num % 10;
			num = num / 10;
			sum = sum + (m * m * m);
		}
		System.out.println(sum);
		if (sum == n) {
			System.out.println("Amrstrong Number");
		} else {
			System.out.println("Not an Armstrong Number");
		}
	}
}
