package core.java.basics;
public class CompoundInterest {
	public static void main(String[] agrs) {
		int p = 100000;
		int r = 10;
		int t = 5;
		int c = 100;
		int i = p * r * 1 / c;
		for (int x = 1; x <= t; x++) {
			i = p * r * 1 / c;
			p = p + i;
//			System.out.println(i + "      I");
//			System.out.println(p);
		}
		System.out.println("Amount = " + p);
	}
}
