package Homework2;

import java.util.Scanner;

public class Prob7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String flag = "";
		String str = "";
		String[] sentence;
		int counter = 0;
		do
		{
			System.out.printf("Insert your sentence: ");
			str = sc.nextLine();
			System.out.println();
			sentence = str.split(" ");
			for(String s: sentence)
			{
				if(s.startsWith("A") || s.startsWith("a"))
					counter++;
				System.out.printf("Length of \"%10s\" is: %2d", s, s.length());
				System.out.println();
			}
			System.out.println();
			System.out.printf("Total number of word that starts with 'A': %2d", counter);
			System.out.println();
			System.out.println();
			System.out.printf("Do you wanna try again? (Y/N): ");
			flag = sc.nextLine();
			System.out.println();
			if(flag.equals("N"))
				break;
		}while(true);
	}

}
