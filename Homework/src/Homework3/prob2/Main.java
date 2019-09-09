package Homework3.prob2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Employee emp = new Employee("Joe", "Nick", 150000, 2020, 04, 10);
		Account[] accs = new Account[3];
		accs[0] = new Account(emp, AccountType.CHECKING, 300);
		accs[1] = new Account(emp, AccountType.SAVINGS, 300);
		accs[2] = new Account(emp, AccountType.RETIREMENT, 300);
		Scanner sc = new Scanner(System.in);
		for(Account c: accs)
		{
			System.out.printf("Deposit for "+c.getAccountType()+" account. Insert your amount: ");
			c.makeDeposit(sc.nextDouble());
			System.out.println();
		}
		System.out.println("After deposit");
		for(Account c: accs)
		{
			System.out.println(c.toString());
		}
		
		for(Account c: accs)
		{
			System.out.printf("Withdraw from "+c.getAccountType()+" account. Insert your amount: ");
			if(!c.makeWithdrawal(sc.nextDouble()))
				System.out.println("Insuficeint amount in your "+ c.getAccountType() + " account");
			System.out.println();
		}
		System.out.println("After withdrawal");
		for(Account c: accs)
		{
			System.out.println(c.toString());
		}
	}

}
