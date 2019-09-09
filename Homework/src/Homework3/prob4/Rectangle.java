package Homework3.prob4;

public final class Rectangle {
	private final double width;
	private final double height;
	public Rectangle(double heigth, double width)
	{
		this.width = width;
		this.height = heigth;
	}
	public double getWidth() {
		return width;
	}
	public double getHeigth() {
		return height;
	}
	public double computeArea()
	{
		return this.height * this.width;
	}
}
