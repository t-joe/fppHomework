package Homework3.prob1;

public class Customer {
	private String firstName;
	private String lastName;
	private String SSN;
	private Address billingAddress;
	private Address shippingAddress;
	
	public Customer(String firstName, String lastName, String SSN)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.SSN = SSN;
		this.billingAddress = new Address();
		this.shippingAddress = new Address();
	}
		
	public Address getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(String street, String city, String state, String zip) {
		this.billingAddress.setCity(city);
		this.billingAddress.setState(state);
		this.billingAddress.setStreet(street);
		this.billingAddress.setZip(zip);
	}

	public Address getShippingAddress() {
		return shippingAddress;
	}



	public void setShippingAddress(String street, String city, String state, String zip) {
		this.shippingAddress.setCity(city);
		this.shippingAddress.setState(state);
		this.shippingAddress.setStreet(street);
		this.shippingAddress.setZip(zip);
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
	public String getSSN() {
		return SSN;
	}
	public void setSSN(String sSN) {
		SSN = sSN;
	}
	
	@Override
	public String toString()
	{
		return "[" + firstName + ", " + lastName + ", " + "ssn: " + SSN + "," + billingAddress.getCity() +"]"; 
	}
	
}
