package Homework3.prob2;

import java.text.DateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {
	private String name;
	private String nickName;
	private double salary;
	private Date hireDay;

	// constructor
	public Employee(String aName, String aNickName, double aSalary, int aYear, int aMonth, int aDay) {
		name = aName;
		nickName = aNickName;
		salary = aSalary;
		GregorianCalendar cal = new GregorianCalendar(aYear, aMonth - 1, aDay);
		hireDay = cal.getTime();
	}

	public String getName() {
		return name;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String aNickName) {
		nickName = aNickName;
	}

	public double getSalary() {
		return salary;
	} // needs to be improved

	public Date getHireDay() {
		return (Date)hireDay.clone();
	}

	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}

	private String format = "name = %s, salary = %.2f, hireDay = %s";

	@Override
	public String toString() {
		return String.format(format, name, salary, Util.dateAsString(hireDay));
	}
}

class Util {
	public static String dateAsString(Date d) {
		DateFormat f = DateFormat.getDateInstance(DateFormat.SHORT);
		return f.format(d);
	}
}
