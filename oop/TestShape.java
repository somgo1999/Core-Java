package core.java.oop;

public class TestShape {
	public static void main(String[] agrs) {
		Shape s = new Shape();
		s.setColor("Blue");
		s.setBorderWidth(25);
		String c = s.getColor();
		int bw = s.getBorderWidth();
		System.out.println("Colour = " + c);
		System.out.println("Border Width = " + bw);
	}
}
