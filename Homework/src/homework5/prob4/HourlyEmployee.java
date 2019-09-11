package homework5.prob4;

public class HourlyEmployee extends Employee {
	private double wage;
	private double hours;

	public HourlyEmployee() {}
	public HourlyEmployee(String fname, String lname, String ssn) {
		super(fname, lname, ssn);
	}

	public double getPayment() {
		return wage * hours;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

}
