package core.java.polymorphism;
public class Shape {
private String color;
private int borderWidth;
public Shape() {
	
}
public Shape(String c, int bw) {
	color = c;
	borderWidth = bw;
}
public String getColor() {
	return color;
}
public int getBorderWidth() {
	return borderWidth;
}
public double area() {
	return 0;
}
}
