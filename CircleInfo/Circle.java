package Week19.CircleInfo;

public class Circle {
	private double radius;
	private final double PI = 3.14159;
	private double area;
	private double diameter;
	private double circumference;

	public Circle(double r) {
		radius = r;
	}

	public Circle() {
		radius = 0.0d;
	}

	public void setRadius(double r) {
		radius = r;
	}

	public double getRadius() {
		return radius;
	}

	public double getArea() {
		return area = PI * radius * radius;
	}

	public double getDiameter() {
		return diameter = radius * 2;
	}

	public double getCircumference() {
		return circumference = 2 * PI * radius;
	}
}
