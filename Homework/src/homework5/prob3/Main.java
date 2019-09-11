package homework5.prob3;

public class Main {

	public static void main(String[] args) {
		Figure[] fig = new Figure[5];
		fig[0] = new UpwardHat();
		fig[1] = new UpwardHat();
		fig[2] = new DownwardHat();
		fig[3] = new FaceMaker();
		fig[4] = new Vertical();
		
		for(Figure f: fig)
		{
			f.getFigure();
		}
		System.out.println("\n\n\nWith class name\n\n");
		for(Figure f: fig)
		{
			System.out.print(f.getClass().getSimpleName() + ": ");
			f.getFigure();
			System.out.println("");
		}
	}

}
