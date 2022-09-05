package core.java.polymorphism;

public class Square extends Shape{
	private int side;
public Square() {
	
}
	public Square(int side) {
		this.side = side;
	}

	public int getSide() {
		return side;
	}

	public double area() {
		double areas = (side * side);
		return areas;
	}
}
