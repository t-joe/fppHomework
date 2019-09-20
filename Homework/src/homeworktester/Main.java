package homeworktester;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		// TODO code application logic here
		String name = "Komakech";
		//System.out.println(min(name));
		 System.out.println(min("komakech"));
	}

	public static char min(String qwe) {

		if (qwe.isEmpty())
			return 0;

		if (qwe.length() == 1)
			return qwe.charAt(0);

		else {

			char first = qwe.charAt(0);
			char secondx = qwe.charAt(1);

			qwe = qwe.substring(1);

			if (first > secondx) {

				first = secondx;
			}

			else {
				qwe = first + qwe.substring(1);
				// System.out.println(qwe);
			}
			return min(qwe);

		}
	}
}
