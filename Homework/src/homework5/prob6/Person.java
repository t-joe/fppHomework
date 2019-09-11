package homework5.prob6;

import homework5.prob5.Computer;

public class Person implements Cloneable {

	String name;
	Computer computer;

	public static void main(String[] args) {

		try {
			// shallow copy

			Computer c1 = new Computer("Dell", "intel I3", 8, 2.5);
			Person porig = new Person("Peter", c1);
			Person pclone = (Person) porig.clone();
			porig.name = "Dollar";
			System.out.println("******************************Shallow copy***************************************");
			System.out.println("---------Original object---------");
			System.out.println("Original object name: " + porig.name + "\n\t Original Compter Ram: " + porig.computer.getRamSize());
			System.out.println("Changed original computer's ram into 4");
			porig.computer.setRamSize(4);
			System.out.println("---------Cloned object-----------");
			System.out.println("Cloned object name: " + pclone.name + "\n\t Cloned Computer Ram: " + pclone.computer.getRamSize());

			// deep copy
			// to do this, please uncomment deep copy part in clone method
			/*Person prs = new Person("OriginalPerson", c1);
			Person prsClone = (Person) prs.clone();
			System.out.println("******************************Deep copy***************************************");
			System.out.println("---------------Original object---------------");
			System.out.println("Original person's name: " + prs.name + "\n\t Ram: " + prs.computer.getRamSize());
			System.out.println("Changed original persons computer ram into 16");
			prs.computer.setRamSize(16);
			System.out.println("---------------Cloned object-----------------");
			System.out.println("Cloned person's name: " + prsClone.name + "\n\t Cloned person's computer ram: "
					+ prsClone.computer.getRamSize());
*/
		} catch (CloneNotSupportedException ex) {

		}
	}

	public Person(String name, Computer c) {
		this.name = name;
		this.computer = c;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Person p = (Person) super.clone();
		//p.computer = (Computer) this.computer.clone();
		return p;
	}
}
