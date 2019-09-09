package homeworktester;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Arrays;
import java.util.Scanner;

import Homework3.prob1.Address;
import Homework3.prob1.Customer;
import RandomNumber.RandomNumbers;

public class Main {
	public static void main(String[] args) {
		String[] arr = {"horse", "dog", "cat", "horse","dog", "horse", "horse", "horse", "horse", "horse"};
		String[] result = removeDups(arr);
		System.out.println(Arrays.toString(result));
	}
	
	public static String[] removeDups(String[] arr) {
		if(arr==null  || arr.length == 0 || arr.length == 1){ 
			return arr;
		}
		else {
			int len = arr.length;
			StringBuilder distinctArray = new StringBuilder(arr[0]);
			for(int i = 1; i < len; ++i) {
				boolean flag = false;
				for(int j = 0; j < i; ++j) {
					if(arr[j].equals(arr[i])) {
						flag = true;
						break;
					}
				}
				if(!flag) {
					distinctArray.append("," + arr[i]);
				}
			}
			String[] noDupsArray = distinctArray.toString().split(",");
			return noDupsArray;
			
		}
		

	}
}
