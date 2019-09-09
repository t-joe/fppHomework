package Homework1;

import java.text.MessageFormat;

import RandomNumber.RandomNumbers;

public class Prob1 {

	public static void main(String[] args) {
		int x = RandomNumbers.getRandomInt(1,  9);
		int y = RandomNumbers.getRandomInt(3, 14);
		
		String str = MessageFormat.format("RandomNumber is : {0}, pow({1}, {2}) = {3}", new Object[] {x, Math.PI, x, Math.pow(Math.PI, x)});
		
		System.out.printf(str);
		System.out.println();
		System.out.printf(MessageFormat.format("RandomNumber is : {0}, pow({1}, {2}) = {3}", new Object[]{y,y, Math.PI, Math.pow(y, Math.PI)}));
	}

}
