package core.java.prachimamquestions;

public class SimpleInterest {
	public void simpleInterest(double p, double r, double t) {
		double i = (p * r * t / 100);
		double a = p + i;
		System.out.println("Interest = " + i);
		System.out.println("Amount = " + a);
	}

	public static void main(String[] agrs) {
		SimpleInterest si = new SimpleInterest();
		si.simpleInterest(50000, 10, 10);
	}
}
