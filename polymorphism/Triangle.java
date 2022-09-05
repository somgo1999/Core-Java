package core.java.polymorphism;

public class Triangle extends Shape {
	private int height;
	private int base;

	public Triangle() {

	}

	public Triangle(int height, int base) {
		this.height = height;
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public int getBase() {
		return base;
	}

	public double area() {
		double areat = ((height * base) / 2);
		return areat;
	}
}
