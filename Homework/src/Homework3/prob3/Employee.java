package Homework3.prob3;

import java.time.LocalDate;

import Homework3.prob2.AccountType;

public class Employee {
	private Account savingsAcct;
	private Account checkingAcct;
	private Account retirementAcct;
	private String name;
	private LocalDate hireDate;

	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire) {
		this.name = name;
		this.hireDate = LocalDate.of(yearOfHire, monthOfHire, dayOfHire);
	}

	public void createNewChecking(double startAmount) {
		checkingAcct = new Account(this, AccountType.CHECKING, startAmount);
	}

	public void createNewSavings(double startAmount) {
		savingsAcct = new Account(this, AccountType.SAVINGS, startAmount);

	}

	public void createNewRetirement(double startAmount) {
		retirementAcct = new Account(this, AccountType.RETIREMENT, startAmount);

	}

	public String getFormattedAcctInfo() {
		StringBuilder sb = new StringBuilder();
		sb.append("ACCOUNT INFO FOR " + this.name + "\n\n");
		if (this.checkingAcct != null) {
			sb.append(this.checkingAcct.toString());
			sb.append("\n");
		}
		if (this.savingsAcct != null) {
			sb.append(this.savingsAcct.toString());
			sb.append("\n");
		}
		if (this.retirementAcct != null) {
			sb.append(this.retirementAcct.toString());
			sb.append("\n");
		}
		sb.append("\n");
		return sb.toString();
	}

	public void deposit(String acctType, double amt) {
		switch (AccountType.valueOf("accType")) {
		case CHECKING:
			checkingAcct.makeDeposit(amt);
			break;
		case SAVINGS:
			savingsAcct.makeDeposit(amt);
			break;
		case RETIREMENT:
			retirementAcct.makeDeposit(amt);
			break;
		default:
			System.out.println("Invalid account type");

		}
	}

	public boolean withdraw(String acctType, double amt) {
		switch (AccountType.valueOf(acctType)) {
		case SAVINGS:
			return savingsAcct.makeWithdrawal(amt);
		case CHECKING:
			return checkingAcct.makeWithdrawal(amt);
		case RETIREMENT:
			return retirementAcct.makeWithdrawal(amt);
		}
		return true;
	}

	public LocalDate getHireDate() {
		return this.hireDate;
	}

	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}

}
