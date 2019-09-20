package labs.lesson5;

public class Main {

	public static void main(String[] args) {
		char c = 'a';
		System.out.println((int)'a');
	}
	
	static void reverse(String str)
	{
		if(str == null || str.equals(""))
			return;
		else
		{
			reverse(str.substring(1));
			System.out.printf("%s",str.charAt(0));
		}
	}

}
