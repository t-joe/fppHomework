package homework5.prob4;

public class SalariedEmployee extends Employee{
	private double weeklySalary;
	public SalariedEmployee(String fname, String lname, String ssn, double weeklySalary)
	{
		super(fname, lname, ssn);
		this.weeklySalary = weeklySalary;
	}
	public double getPayment()
	{
		return weeklySalary;
	}
	public double getWeeklySalary() {
		return weeklySalary;
	}
	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}
}
