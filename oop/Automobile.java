package core.java.oop;
public class Automobile {
private String color;
private int speed;
private String make;
public static final int no_of_gears = 6;
public void setColor(String color) {
this.color = color;
}
public String getColor() {
	return color;
}
public void setMake(String make) {
	this.make = make;
}
public String getMake() {
	return make;
}
public void setSpeed(int speed) {
	this.speed = speed;
}
public int getSpeed() {
	return speed;
}
}
