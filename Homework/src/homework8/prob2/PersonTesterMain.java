package homework8.prob2;

import java.util.Arrays;

public class PersonTesterMain {

	public static void main(String[] args) {
		Person p = new Person();
		for(int i = 0; i< 10; i++)
			p.add(new Person("Peter" + i, "Josh" + i, 19 + i));
		System.out.println(Arrays.toString(p.getPersons()));
		
		p.insert(new Person("David", "Juul", 9), 5);
		System.out.println("After inserting at 5 "+Arrays.toString(p.getPersons()));
		
		p.remove("Peter5");
		System.out.println("After removing Peter5: "+ Arrays.toString(p.getPersons()));
		
		System.out.println("Finding David: "+p.find("David"));
		
		System.out.println("Get person at 4th position: " + p.get(4).toString());
		
	}

}
