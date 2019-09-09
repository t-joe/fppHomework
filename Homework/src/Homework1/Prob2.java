package Homework1;

public class Prob2 {

	public static void main(String[] args) {
		float a = 1.27f, b = 3.881f, c = 9.6f;
		System.out.println("Individual cast = " + ((int)a + (int)b + (int)c));
		System.out.println("General cast = " + (int)(a + b + c));
		
		System.out.println("Individual round = "+ (Math.round(a) + Math.round(b) + Math.round(c)));
		System.out.println("General round = "+ Math.round(a + b + c));
	}

}
