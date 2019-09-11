package homework5.prob1;

public class Main {

	public static void main(String[] args) {
		Shape[] ms = new Shape[5];
		ms[0] = new Rectangle("Black", 10, 6);
		ms[1] = new Circle("Blue", 10);
		ms[2] = new Square("Yellow", 5);
		ms[3] = new Square("Dark", 8);
		ms[4] = new Rectangle("White", 4, 6);
		printTotal(ms);
	}
	public static void printTotal(Shape[] shapes)
	 { 
		for(Shape s: shapes)
			System.out.println(s.getClass().getSimpleName() + "\n\t Area: "+ s.calculateArea() + "\n\t Perimeter: "+ s.calculatePerimeter() + "\n\t Color: " + s.color);
	 } 
}
