package Homework1;

public class Prob8 {

	public static void main(String[] args) {
		int[] arr = new int[] {2, -21, 3, 45, 0, 12, 18, -36, 3, 1, 0, 22};
		int min;
		if(arr.length == 0) return;
		min = arr[0];
		for(int i = 1; i< arr.length; i++)
			if(min > arr[i])
				min = arr[i];
		System.out.println("Min value; " + min);
	}

}
