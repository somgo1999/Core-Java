package core.java.polymorphism;

public class TestShapePolymorphismArray extends Shape {
	public static void main(String[] args) {
		Shape[] s = new Shape[4];
		s[0] = new Rectangle(10, 10);
		s[1] = new Circle(10);
		s[2] = new Triangle(10, 20);
		s[3] = new Square(10);
		System.out.println(s[0].area() + s[1].area() + s[2].area() + s[3].area());
TestShapePolymorphismArray tspa = new TestShapePolymorphismArray();
		System.out.println("Total Area = " + tspa.shapeArea(Shape[]));
	}

	public static double shapeArea(Shape[] s) {
		double totalArea = 0;
		for (int i = 0; i < s.length; i++) {
			totalArea += s[i].area();
		}
		return totalArea;
	}
}
