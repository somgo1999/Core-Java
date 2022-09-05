package core.java.polymorphism;

public class Circle extends Shape {
	private int radius;
	public static final double Pi = 3.14;

	public Circle() {

	}

	public Circle(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public double area() {
		double areac = (Pi * radius * radius);
		return areac;
	}
}
