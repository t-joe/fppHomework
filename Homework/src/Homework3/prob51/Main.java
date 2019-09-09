package Homework3.prob51;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String smonth;
		int year, month, day, dOfYear;
		String flag;
		int choice;
		MyDate md;
		do
		{
			System.out.println("1 for MM/DD/YYYY");
			System.out.println("2 for Month DD, YYYY");
			System.out.println("3 for MM/DD/YYYY");
			System.out.println("4 to exit");
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.printf("Year: ");
				year = sc.nextInt();
				System.out.printf("\nMonth: ");
				month = sc.nextInt();
				System.out.printf("\nDay: ");
				day = sc.nextInt();
				md = new MyDate(year, month, day);
				System.out.println(md.getDate(1));
				break;
			case 2:
				System.out.printf("Year: ");
				year = sc.nextInt();
				System.out.printf("\nMonth in text: ");
				smonth = sc.next();
				System.out.printf("\nDay: ");
				day = sc.nextInt();
				md = new MyDate(smonth, year, day);
				System.out.println(md.getDate(2));
				break;
			case 3:
				System.out.printf("Year: ");
				year = sc.nextInt();
				System.out.printf("\nDay of year: ");
				dOfYear = sc.nextInt();
				md = new MyDate(dOfYear, year);
				System.out.println(md.getDate(3));
				break;
			case 4:
				System.out.println("Terminated");
				return;
			}
			
			System.out.printf("Try another one? :");
			sc=  new Scanner(System.in);
			flag = sc.nextLine();
		}while(flag.equalsIgnoreCase("y"));
	}

}
