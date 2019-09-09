package Homework3.prob4;

public final class Traingle {
	private final double base;
	private final double height;
	public Traingle(double base, double height)
	{
		this.base = base;
		this.height = height;
	}
	public double getBase() {
		return base;
	}
	public double getHeight() {
		return height;
	}
	public double computeArea()
	{
		return (this.base * this.height) / 2;
	}
}
