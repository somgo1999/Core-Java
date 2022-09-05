package core.java.prachimamquestions;

public class Percentage {
	public void percent(double a, double b) {
		System.out.println("Percentage = " + ((a * 100) / b) + "%");
	}

	public static void main(String[] agrs) {
		Percentage p = new Percentage();
		p.percent(250, 1000);
	}
}
