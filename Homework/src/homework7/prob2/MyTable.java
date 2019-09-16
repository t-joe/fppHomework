package homework7.prob2;

import java.util.Scanner;

public class MyTable {

	private class Entry {
		private String body;
		private char ch;

		public Entry(char c, String s) {
			this.body = s;
			this.ch = c;
		}

		public String toString() {
			return "" + ch + "=>" + body;
		}
	}

	private static Entry[] entries;

	public void add(char c, String s) {
		Entry etr = new Entry(c, s);
		int pos = (int) etr.ch - 97;
		if (pos >= 26) {
			System.out.println("Out of Index");
			return;
		}
		entries[pos] = etr;
	}

	public String get(char c) {
		int pos = (int) c - 97;
		if (pos >= 26) {
			System.out.println("Out of index");
			return "Please enter correct character";
		}
		return entries[pos] == null ? "Not found" : entries[pos].toString();
	}

	public MyTable() {
		entries = new Entry[26];
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < entries.length; i++) {
			if (entries[i] != null) {
				sb.append(entries[i].toString());
				sb.append("\n");
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int choice = 0;
		MyTable mt = new MyTable();
		char ch;
		String str;
		do {
			System.out.println("1: add");
			System.out.println("2: get");
			System.out.println("3: print");
			System.out.println("4: exit");
			System.out.println("Choice: ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter character: ");
				str = sc.next();
				ch = str.charAt(0);
				System.out.println("Enter name: ");
				str = sc.next();
				mt.add(ch, str);
				System.out.println("Added succesfully");
				break;
			case 2:
				System.out.println("Enter character: ");
				ch = sc.next().charAt(0);
				System.out.println(mt.get(ch));
				break;
			case 3:
				System.out.println(mt.toString());
				break;
			case 4:
				break;
			default:
				System.out.println("Wrong choice");
				break;
			}
		} while (choice < 4);
		sc.close();
	}
}
