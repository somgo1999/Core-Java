package core.java.exercise14;

public class AverageOfNConsecutiveOddEvenNumbers14 {
	public static void main(String[] agrs) {
		int o = 1;
		int e = 2;
		int n = 10;
		int ae = ((2 * e + ((n - 1) * 2)) / 2);
		int ao = ((2 * o + ((n - 1) * 2)) / 2);
		System.out.println(ae);
		System.out.println(ao);
	}
}