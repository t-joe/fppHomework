package Homework1;

import java.util.Arrays;

public class Prob6 {

	public static void main(String[] args) {
		String[] arr1 = {"horse", "dog", "cat", "horse","dog", "tog", "Tog", "dog", "hello", "hello", "cat"};
		if(arr1.length == 0) return;
		boolean dupFound = false;
		String[] distinctArray = new String[0];
		int counter = 0;
		for(String s: arr1)
		{
			dupFound = false;
			for(int i=0; i< distinctArray.length; i++)
				if(String.valueOf(distinctArray[i]).equals(s))
				{
					dupFound = true;
					break;
				}
			if(!dupFound)
			{
				if(s != null)
				{
					distinctArray = resizeArray(distinctArray);
					distinctArray[counter++] = s;
				}
			}
		}
		System.out.println(Arrays.toString(distinctArray));
	}
	
	private static String[] resizeArray(String[] arr)
	{
		String[] newStr = new String[arr.length + 1];
		System.arraycopy(arr, 0, newStr, 0, arr.length); 
		return newStr;
	}

}
