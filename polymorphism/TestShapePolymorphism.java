package core.java.polymorphism;

public class TestShapePolymorphism {
	public static void main(String[] args) {
		Shape r = new Rectangle(10, 20);
		Shape c = new Circle(10);
		Shape t = new Triangle(10, 20);
		Shape s = new Square(10);
		System.out.println("Total Area = " + (r.area() + c.area() + t.area() + s.area()));
	// This program will only take Parents Setter and Getter and will Over Riding the Parents Area method
	}
}
