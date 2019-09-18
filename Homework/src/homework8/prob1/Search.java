package homework8.prob1;

public class Search {
	String[] strArray;
	public Search(String[] arr)
	{
		strArray = arr;
	}
	public boolean search(String find)
	{
		return binSearch(0, strArray.length, find);
	}
	private boolean binSearch(int min, int max, String find)
	{
		if(strArray.length == 0 || strArray ==  null) return false;
		if(min > max) return false;
		int mid = (min + max )/ 2;
		if(String.valueOf(strArray[mid]).compareTo(find) == 0) return true;
		else if(String.valueOf(strArray[mid]).compareTo(find) < 0)
			return binSearch(mid+1, max, find);
		else
			return binSearch(min, mid-1, find);
	}
}
