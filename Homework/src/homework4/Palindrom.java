package homework4;

public class Palindrom {

	public static void main(String[] args) {
		//String str = "madam";
		//System.out.println(isPalindrom(str));
		//System.out.println(generatePal(str));
	}
	public boolean isPalindrom(String str)
	{
		boolean result = false;
		if (str.equals(generatePal(str)))
			result = true;
		return result;
	}
	
	private static String generatePal(String str)
	{
		if(str.length() == 1)
			return str;
		return generatePal(str.substring(1)) + str.charAt(0);
	}
}
