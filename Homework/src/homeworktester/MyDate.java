package homeworktester;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MyDate {
	private int year;
	private int month;
	private String monthLetter;
	private int day;
	private int daysInYear;

	public MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public MyDate(String monthLetter, int year, int day) {
		this.monthLetter = monthLetter;
		this.year = year;
		this.day = day;
	}

	public MyDate(int daysInYear, int year) {
		this.daysInYear = daysInYear;
		this.year = year;
	}
	
	public static final String DATE_PATTERN = "MM/dd/yyyy";
	
	public static LocalDate localDateForString(String date) {
		return LocalDate.parse(date,DateTimeFormatter.ofPattern(DATE_PATTERN));
	}
	public static String localDateAsString(LocalDate date,String datepattern) {
		return date.format(DateTimeFormatter.ofPattern(datepattern));
	}
	
	public static void displayDateFormate(LocalDate d) {
		System.out.println(" MM/dd/yyyy: " + localDateAsString(d, "MM/dd/yyyy"));
		System.out.println(" MMMM dd,yyyy: " + localDateAsString(d, "MMMM dd,yyyy"));
		System.out.println(" DDD yyyy: " + localDateAsString(d, "DDD yyyy"));
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int year;
		int month;
		String monthLetter;
		int day;
		int daysInYear;
		boolean flag=false;
		
		
		do {
			System.out.println("Enter 1 for format: MM/DD/YYYY");
			System.out.println("Enter 2 for format: Month DD, YYYY");
			System.out.println("Enter 3 for format: DDD YYYY");
			System.out.println("Enter 4 to exit");
			System.out.println("Enter your chose:");
            int chose=input.nextInt();
			switch (chose) {
			case 1:
				System.out.println("Choice:1");
				System.out.println("Enter a month:");
				month = input.nextInt();
				System.out.println("Enter a Day:");
				day = input.nextInt();
				System.out.println("Enter a year:");
				year = input.nextInt();				
				displayDateFormate(LocalDate.of(year, month, day));				
			
				break;
			case 2:
				System.out.println("Choice:2");
				System.out.println("Enter a month in text:");
				monthLetter = input.nextLine();
				System.out.println("Enter a Day:");
				day = input.nextInt();
				System.out.println("Enter a year:");
				year = input.nextInt();	
			
				displayDateFormate(LocalDate.parse(monthLetter+""+day+","+year));			
			
				break;
			case 3:
				System.out.println("Choice:3");
				
				System.out.println("Enter a Day:");
				day = input.nextInt();
				System.out.println("Enter a year:");
				year = input.nextInt();	
			
				displayDateFormate(LocalDate.parse(day+" "+year));			
			
				break;
			default:
				break;
		   }
			System.out.println("Do you want to Continue?(yes/no)");
			String a=input.nextLine();
			flag=Boolean.parseBoolean(a);
		}while(flag);
	}
}
