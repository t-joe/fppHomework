package homework4;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = new int[] {10, 2, 5, 7, 8, 20, 33, -1, 0, -4, 11, 12, 19, 30, 41, -6, 0};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(search(12, 0, arr.length-1, arr));
	}
	
	public int binarySearch(int[] arr, int searchElem)
	{
		Arrays.sort(arr);
		return search(searchElem, 0, arr.length, arr);
	}

	private static int search(int findElem, int startPos, int endPos, int[] arr)
	{
		int mid = (startPos + endPos) / 2;
		if(arr[mid] == findElem)
			return mid;
		if(startPos > endPos)
			return -1;
		else if(arr[mid] > findElem)
			return search(findElem, startPos, mid-1, arr);
		else 
			return search(findElem, mid+1, endPos, arr);
	}
}
