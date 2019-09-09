package unittest;

import static org.junit.Assert.*;

import org.junit.Test;

import homework4.BinarySearch;
import homework4.Palindrom;

public class TestCases {

	@Test
	public void palindromTest() {
		Palindrom pl = new Palindrom();
		String str = "aaabcbaaa";
		boolean result = pl.isPalindrom(str);
		assertEquals(true, result);
	}
	@Test
	public void binarySearchTest()
	{
		BinarySearch bs = new BinarySearch();
		int[] arr = new int[] {10, 2, 5, 7, 8, 20, 33, -1, 0, -4, 11, 12, 19, 30, 41, -6, 0};
		int result = bs.binarySearch(arr, 12);
		int expected = 11;
		assertEquals(expected, result);
	}

}
