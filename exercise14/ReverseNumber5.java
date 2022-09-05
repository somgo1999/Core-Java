package core.java.exercise14;

public class ReverseNumber5 {
	public static void main(String[] agrs) {
		int num = 123456789;
		int n = num;
		int sum = 0;
		int r = 0;
		while (num != 0) {
			r = num % 10;
			num = num / 10;
			sum = (sum * 10) + r;
		}
		System.out.println("The Reverse Number of " + n + " = " + sum);
	}
}
