package Homework2;

import java.util.Scanner;

public class Prob4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "";
		String flag = "";
		do
		{
			System.out.println("Pls enter your string: ");
			str = sc.nextLine();
			System.out.printf("Reversed string is: ");
			Prob4.PrintReverse(str);
			
			System.out.println("Would you like to try onemore? Y/N");
			flag= sc.nextLine();
		}while(flag.equals("Y"));
	}
	private static void PrintReverse(String str)
	{
		int size = str.length();
		if(size == 0) System.out.println("");;
		for(int i = size - 1; i>= 0; i--)
			System.out.printf("%s", str.charAt(i));
		System.out.println();
	}
}
