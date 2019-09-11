package homework5.prob4;

public class CommissionEmployee extends Employee{
	protected double grossSale;
	protected double commissionRate;
	public CommissionEmployee(String fname, String lname, String ssn)
	{
		super(fname, lname, ssn);
	}
	public CommissionEmployee()
	{}
	protected double getPayment()
	{
		return grossSale * commissionRate;
	}
	public double getGrossSale() {
		return grossSale;
	}
	public void setGrossSale(double grossSale) {
		this.grossSale = grossSale;
	}
	public double getCommissionRate() {
		return commissionRate;
	}
	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}
	
}
