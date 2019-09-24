package homework12.prob2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CustomerAccount ca1 = new CustomerAccount("John", "10000", 200);
		try
		{
			System.out.println("Enter the amount that you want to draw: ");
			double amount = sc.nextDouble();
			System.out.println(ca1.withdraw(amount) == 1? "Successful draw": "");
		}
		catch(InputMismatchException iex)
		{
			System.out.println(iex.getMessage());
		}
		catch(MyException ex)
		{
			System.out.println(ex.getMessage());
		}
		finally
		{
			sc.close();
		}
	}

}
