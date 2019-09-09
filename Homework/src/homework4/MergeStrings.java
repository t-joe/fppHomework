package homework4;

public class MergeStrings {

	public static void main(String[] args) {
		System.out.println(merge("acegz", "bdfhjl").toString());
	}
	
	private static String merge(String str1, String str2)
	{
		int i;
		if(str2.length() == 0 || str2 == null)
			return str1;
		char[] strArr = new char[str1.length() + str2.length()];
		str1.getChars(0, str1.length(), strArr, 0);
		//loop through first string and positioning char of second string. 
		for(i = 0; i< strArr.length; i++)
		{
			if(strArr[i] > str2.charAt(0))
			{
				strArr = insertAt(i, str2.charAt(0), strArr);
				break;
			}
			else if(strArr[i] == 0)
			{
				strArr[i] = str2.charAt(0);
				break;
			}
		}
		//recursing through second string
		return merge(new String(strArr), str2.substring(1));
	}
	
	private static char[] insertAt(int pos, char ch, char[] arr)
	{
		if(pos >= arr.length-1 || arr[pos] == 0)
		{
			arr[pos] = ch;
			return arr;
		}
		char tmp;
		tmp = arr[pos];
		arr[pos] = ch;
		return insertAt(++pos, tmp, arr);
	}

}
