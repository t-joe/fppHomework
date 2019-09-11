package homework5.prob1;

public class Rectangle extends Shape{
	protected double width, height;
	public Rectangle(String color, double width, double height)
	{
		super(color);
		this.width = width;
		this.height = height;
	}
	public Rectangle()
	{}
	@Override
	public double calculateArea()
	{
		return this.width * this.height;
	}
	@Override
	public double calculatePerimeter()
	{
		return (this.width + this.height) * 2;
	}
}
