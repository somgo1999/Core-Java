package core.java.inheritance;

public class Circle extends Shape {
	private int radius;

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getradius() {
		return radius;
	}

	public void area() {
		double areac = Shape.PI * (radius * radius);
		System.out.println(areac);
	}
}
