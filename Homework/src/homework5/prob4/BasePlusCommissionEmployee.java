package homework5.prob4;

public class BasePlusCommissionEmployee extends CommissionEmployee{
	private double baseSalary;
	public BasePlusCommissionEmployee(String fname, String lname, String ssn, double baseSalary)
	{
		super(fname, lname, ssn);
		this.baseSalary = baseSalary;
	}
	public BasePlusCommissionEmployee() {}
	public double getPayment()
	{
		return baseSalary + grossSale * commissionRate;
	}
	public double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
}
