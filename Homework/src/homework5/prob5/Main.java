package homework5.prob5;

public class Main {

	public static void main(String[] args) {
		Computer c1 = new Computer("Lenovo", "intel I3", 8, 2.5);
		Computer c2 = new Computer("Dell", "Intel I3", 8, 2.5);
		Computer c3 = new Computer("Lenovo", "intel I3", 8, 2.5);
		System.out.println(c1.equals(c2)); // false
		System.out.println(c1.equals(c3)); // true;
		System.out.println(c1.hashCode() + " : " + c3.hashCode());
	}
}
