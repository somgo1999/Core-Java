package core.java.prachimamquestions;

public class SumSubMulDivMethod {
	public void add(double a, double b) {
		System.out.println(a + b);
	}

	public void sub(double a, double b) {
		System.out.println(a - b);
	}

	public void mul(double a, double b) {
		System.out.println(a * b);
	}

	public void div(double a, double b) {
		System.out.println(a / b);
	}

	public static void main(String[] agrs) {
		SumSubMulDivMethod ssmdm = new SumSubMulDivMethod();
		ssmdm.add(100, 100);
		ssmdm.sub(100, 10);
		ssmdm.mul(100, 100);
		ssmdm.div(100, 10);
	}
}
