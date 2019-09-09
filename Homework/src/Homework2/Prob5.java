package Homework2;

import RandomNumber.RandomNumbers;

public class Prob5 {

	public static void main(String[] args) {
		int[][] numMatrix = new int[4][4];
		/**
		 * Initializing matrix with random numbers
		 */
		for(int i = 0; i< 4; i++)
		{
			for(int j=0; j<4; j++)
			{
				numMatrix[i][j] = RandomNumbers.getRandomInt(1, 99);
			}
		}
		
		Object[] obj = new Object[4];
		String format = "%4s\t %4s\t %4s\t %4s\t";
		int rowCounter = 0;
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<4; j++)
			{
				obj[j] = (i % 2 == 0 ? numMatrix[i][j] : "+ " + numMatrix[i][j]);
			}
			System.out.printf(format, obj);
			System.out.println();
			if(++rowCounter > 1)
			{
				System.out.printf(format, new Object[] {"____","____","____","____"});
				System.out.println();
				System.out.println();
				System.out.println();
				rowCounter = 0;
			}
		}
	}

}
