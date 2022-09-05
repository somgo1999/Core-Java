package core.java.inheritance;

public class Square {
	private int side;

	public Square(int s) {
		side = s;
	}

	public int getSide() {
		return side;
	}

	public void area() {
		int area = side * side;
		System.out.println(area);
	}
}
