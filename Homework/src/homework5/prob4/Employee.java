package homework5.prob4;

public abstract class Employee{
	protected String firstName;
	protected String lastName;
	protected String ssn;
	protected abstract double getPayment();
	public Employee()
	{}
	public Employee(String fname, String lname, String ssn)
	{
		this.firstName = fname;
		this.lastName = lname;
		this.ssn = ssn;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSsn() {
		return ssn;
	}
}
