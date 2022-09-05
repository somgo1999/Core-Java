package core.java.prachimamquestions;

public class DivisiblityTestOfSeven {
	public void testSeven(double s) {
		if (s % 7 == 0) {
			System.out.println("The given number is divisible by Seven = " + s);
		} else {
			System.out.println("The given number is not divisible by Seven");
		}
	}

	public static void main(String[] agrs) {
		DivisiblityTestOfSeven dts = new DivisiblityTestOfSeven();
		dts.testSeven(24);
	}
}
