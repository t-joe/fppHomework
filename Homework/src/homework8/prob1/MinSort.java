package homework8.prob1;

public class MinSort {
	String[] strArray;

	public MinSort(String[] arg) {
		this.strArray = arg;
	}

	public String[] sort() {
		if (strArray == null || strArray.length == 0)
			return null;
		int minPos = 0;
		int lengh = strArray.length;
		for (int i = 0; i < strArray.length; i++) {
			minPos = findMinPos(i, lengh - 1);
			swap(i, minPos);
		}
		return strArray;
	}

	private int findMinPos(int min, int max) {
		int minPos = min;
		String str = strArray[min];
		for (int i = min + 1; i < max; i++) {
			if (str != null && strArray[i] != null) {
				if (str.compareTo(strArray[i]) > 0) {
					minPos = i;
					str = strArray[i];
				}
			}
		}
		return minPos;
	}

	private void swap(int pos1, int pos2) {
		String tmp = strArray[pos1];
		strArray[pos1] = strArray[pos2];
		strArray[pos2] = tmp;
	}
}
