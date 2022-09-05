package core.java.inheritance;

public class Rectangle extends Shape {
	private int length;
	private int width;

	public void setLength(int length) {
		this.length = length;
	}

	public int getLength() {
		return length;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getWidth() {
		return length;
	}

	public void area() {
		int arear = length * width;
		System.out.println(arear);
	}
}
