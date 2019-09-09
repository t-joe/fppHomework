package Homework3.prob51;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class MyDate {
	private static final String DATE_FORMAT1 = "MM/dd/YYYY";
	private static final String DATE_FORMAT2 = "MMMM dd, YYYY";
	private static final String DATE_FORMAT3 = "D YYYY";
	
	private String smonth;
	private int day;
	private int year;
	private int month;
	private int dayOfYear;
	public MyDate(int year, int month, int day)
	{
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public MyDate(String month, int year, int day)
	{
		this.smonth = month;
		this.year = year;
		this.day = day;
	}
	public MyDate(int dayOfYear, int year)
	{
		this.dayOfYear = dayOfYear;
		this.year = year;
	}
	public String getDate(int choice)
	{
		StringBuilder sb = new StringBuilder();
		switch(choice)
		{
		case 1: 
			sb.append("MM/DD/YYYY: ");
			sb.append(LocalDate.of(this.year, this.month, this.day).format(DateTimeFormatter.ofPattern(DATE_FORMAT1)));
			sb.append("\n");
			sb.append("month DD, YYYY: ");
			sb.append(LocalDate.of(this.year, this.month, this.day).format(DateTimeFormatter.ofPattern(DATE_FORMAT2)));
			sb.append("\n");
			sb.append("DDD YYYY: ");
			sb.append(LocalDate.of(this.year, this.month, this.day).format(DateTimeFormatter.ofPattern(DATE_FORMAT3)));
			sb.append("\n");
			break;
		case 2:
			try {
			Date date = new SimpleDateFormat("MMM", Locale.ENGLISH).parse(smonth);
		    Calendar cal = Calendar.getInstance();
		    cal.setTime(date);
		    this.month = cal.get(Calendar.MONTH) + 1;
			sb.append("MM/DD/YYYY: ");
			sb.append(LocalDate.of(this.year, this.month, this.day).format(DateTimeFormatter.ofPattern(DATE_FORMAT1)));
			sb.append("\n");
			sb.append("month DD, YYYY: ");
			sb.append(LocalDate.of(this.year, this.month, this.day).format(DateTimeFormatter.ofPattern(DATE_FORMAT2)));
			sb.append("\n");
			sb.append("DDD YYYY: ");
			sb.append(LocalDate.of(this.year, this.month, this.day).format(DateTimeFormatter.ofPattern(DATE_FORMAT3)));
			sb.append("\n");
			}
			catch(Exception ex)
			{}
			break;
		case 3:
			Year y = Year.of(this.year);
			LocalDate ld = y.atDay(this.dayOfYear);
			sb.append("MM/DD/YYYY: ");
			sb.append(ld.format(DateTimeFormatter.ofPattern(DATE_FORMAT1)));
			sb.append("\n");
			sb.append("month DD, YYYY: ");
			sb.append(ld.format(DateTimeFormatter.ofPattern(DATE_FORMAT2)));
			sb.append("\n");
			sb.append("DDD YYYY: ");
			sb.append(ld.format(DateTimeFormatter.ofPattern(DATE_FORMAT3)));
			sb.append("\n");
			break;
		}
		return sb.toString();
	}
	
	public String getSmonth() {
		return smonth;
	}
	public void setSmonth(String smonth) {
		this.smonth = smonth;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDayOfYear() {
		return dayOfYear;
	}
	public void setDayOfYear(int dayOfYear) {
		this.dayOfYear = dayOfYear;
	}
	
}
