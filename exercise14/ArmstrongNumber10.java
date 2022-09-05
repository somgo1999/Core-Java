package core.java.exercise14;

public class ArmstrongNumber10 {
	public static void main(String[] agrs) {
		int num = 153;
		int n = num;
		int r;
		int sum = 0;
		while (num != 0) {
			r = num % 10;
			sum = sum + (r * r * r);
			num = num / 10;
		}
		if (sum == n) {
			System.out.println("Armstrong Number = " + n);
		} else {
			System.out.println("Given number is not an Armstrong Number");
		}
	}
}
