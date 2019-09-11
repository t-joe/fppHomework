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
		removeDup(new String[] {"horse", "dog", "cat", "hors","dog", "hors", "hors", "hors", "hors", "hors"});

	}
	static void removeDup(String input[]) {
		int x=input.length;
		String temp[]=new String[x];
		int dup=0;
		for(int i=0;i<x;i++) 
		{
			boolean isdup=false;
			for(int j=0;j<x;j++)
			{
				if(input[i]==temp[j]) 
				{
					dup++;
					isdup=true;
					break;
				}
			}
			
			if(isdup==false) 
			{
			temp[i]=input[i];
			}
			
		}
		
		int count=x-dup;
		String distinct[]=new String[count];
		
		for(int i=0,j=0;i<count;i++,j++) 
		{
			if(temp[i]==null) j++;
			distinct[i]=temp[j];
			
		}
		System.out.println(Arrays.toString(distinct));
	}
}
