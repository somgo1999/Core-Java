package core.java.prachimamquestions;

public class CompoundInterest {
	public void compoundInterest(double p, double r, double t) {
		double i;
		double rp = p;
		for (int d = 1; d <= t; d++) {
			i = (p * r * 1) / 100;
			p = p + i;
		}
		i = p - rp;
		System.out.println("Amount = " + p);
		System.out.println("Interest = " + i);
	}

	public static void main(String[] agrs) {
		CompoundInterest ci = new CompoundInterest();
		ci.compoundInterest(100000, 10, 1);
	}
}
