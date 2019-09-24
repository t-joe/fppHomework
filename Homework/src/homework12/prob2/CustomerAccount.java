package homework12.prob2;

public class CustomerAccount {
	private String cusName;
	private String accNum;
	private double balance;

	public CustomerAccount(String cusName, String accNum, double amount) {
		this.cusName = cusName;
		this.accNum = accNum;
		this.balance = amount;
	}

	public boolean deposit(double amount) {
		this.balance += amount;
		return true;
	}

	public int withdraw(double amount) throws MyException{
		if (balance >= amount) {
			if(balance - amount < 100)
				throw new MyException("Account balance should be atleast $100");
			balance -= amount;
			return 1;
		}
		throw new MyException("Insuficient amount in your account");
	}

	public String getCusName() {
		return cusName;
	}

	public void setCusName(String cusName) {
		this.cusName = cusName;
	}

	public String getAccNum() {
		return accNum;
	}

	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}
	
	
}
