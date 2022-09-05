package core.java.polymorphism;

public class Rectangle extends Shape {
	private int length;
	private int width;

	public Rectangle() {
	}

	public Rectangle(int len, int wid) {
		length = len;
		width = wid;
	}

	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}

	public double area() {
		double arear = length * width;
		return arear;
	}
}
