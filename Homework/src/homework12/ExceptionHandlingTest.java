package homework12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mark;
		try {
			System.out.printf("Enter your mark: ");
			mark = sc.nextInt();
			if (mark < 0 || mark > 100)
				throw new IllegalArgumentException("Enter mark inbetween 1 to 100");
			System.out.println("You got " + mark + " marks");
		} catch (InputMismatchException ie) {
			System.out.println(ie + " Please enter number only");
		} catch (IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
		} finally {
			sc.close();
		}
	}
}
