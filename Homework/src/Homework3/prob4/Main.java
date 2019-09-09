package Homework3.prob4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double width = 0, height = 0;
		String flag = "";
		String doAgain = "";
		do {
			System.out.println("C for circle\nR for rectangle\nT for traingle\n");
			System.out.printf("Enter your choice: ");
			
			flag = sc.nextLine();
			switch(flag)
			{
				case "C":
					System.out.printf("Enter radius: ");
					System.out.println("Circle area is: " + new Circle(sc.nextDouble()).computeArea());
					break;
				case "R":
					System.out.printf("Enter height: ");
					height = sc.nextDouble();
					System.out.print("Enter width: ");
					width = sc.nextDouble();
					System.out.println("Rectangle area is: " + new Rectangle(height, width).computeArea());
					break;
				case "T":
					System.out.printf("Enter height: ");
					height = sc.nextDouble();
					System.out.print("Enter base: ");
					width = sc.nextDouble();
					System.out.println("Traingle area is: " + new Traingle(height, width).computeArea());
					break;
				default:
					System.out.println("Please select from menu");
					break;
			}
			System.out.printf("Continue? (Y/N): ");
			sc= new Scanner(System.in);
			doAgain = sc.nextLine();
		}while(doAgain.equals("Y"));
	}

}
