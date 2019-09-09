package homework4;

public class MinChar {

	public static void main(String[] args) {
		String str = "akel";
		System.out.println("min char is: " +minChar(str.substring(1), str.charAt(0)));
	}
	
	private static char minChar(String str, char ch)
	{
		if(str.length() == 0)
			return ch;
		if(str.charAt(0) < ch)
			ch = str.charAt(0);
		return minChar(str.substring(1), ch);
	}

}
