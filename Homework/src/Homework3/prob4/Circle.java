package Homework3.prob4;

public final class Circle {
	private final double radius;
	public Circle(double radius)
	{
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	
	public double computeArea()
	{
		return Math.PI * Math.pow(this.radius, 2);
	}
}
