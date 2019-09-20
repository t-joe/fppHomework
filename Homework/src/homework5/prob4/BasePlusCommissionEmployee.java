package homework5.prob4;

public class BasePlusCommissionEmployee extends CommissionEmployee{
	private double baseSalary;
	public BasePlusCommissionEmployee(String fname, String lname, String ssn, double baseSalary, double grossSale, double commissionRate)
	{
		super(fname, lname, ssn, grossSale, commissionRate);
		this.baseSalary = baseSalary;
	}
	public BasePlusCommissionEmployee() {}
	public double getPayment()
	{
		return baseSalary + super.grossSale * super.commissionRate;
	}
	public double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
}
