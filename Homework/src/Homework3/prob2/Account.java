package Homework3.prob2;

public class Account {
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private AccountType acctType;
	private Employee employee;

	Account(Employee emp, AccountType acctType, double balance) {
		employee = emp;
		this.acctType = acctType;
		this.balance = balance;
	}

	Account(Employee emp, AccountType acctType) {
		this(emp, acctType, DEFAULT_BALANCE);
	}

	@Override
	public String toString() {
		return "type = " + acctType + ", balance = " + balance;
	}

	public void makeDeposit(double deposit) { // implement
		this.balance += deposit;
	}

	public boolean makeWithdrawal(double amount) { // implement
		if(this.balance - amount < 0) return false;
		balance -= amount;
		return true;
	}
	
	public double getBalance()
	{
		return this.balance;
	}
	
	public String getAccountType()
	{
		return this.acctType.toString();
	}
}
