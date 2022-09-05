package core.java.arraypractise;

public class ArrayPractise {
	public static void main(String[] agrs) {
		int[] a = { 100, 200, 300, 10 };
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			sum = sum + a[i];
		}
		System.out.println(sum);
	}
}