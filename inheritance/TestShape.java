package core.java.inheritance;

public class TestShape {
	public static void main(String[] agrs) {
		Circle c = new Circle();
		c.setBorderWidth(1);
		c.setColor("Saffron");
		c.setRadius(10);
		Rectangle r = new Rectangle();
		r.setBorderWidth(2);
		r.setColor("White");
		r.setLength(20);
		r.setWidth(20);
		Triangle t = new Triangle();
		t.setBorderWidth(3);
		t.setColor("Green");
		t.setBreadth(30);
		t.setHeight(30);
		System.out.println(c.getBorderWidth());
		System.out.print(c.getColor());
		System.out.println("Area of Circle = ");
		c.area();
		System.out.println(r.getBorderWidth());
		System.out.println(r.getColor());
		System.out.println(r.getLength());
		System.out.println(r.getWidth());
		System.out.println("Area of Rectangle = ");
		r.area();
		System.out.println(t.getBorderWidth());
		System.out.println(t.getColor());
		System.out.println(t.getHeight());
		System.out.println(t.getBreadth());
		System.out.println("Area of Triangle = ");
		t.area();
	}
}
