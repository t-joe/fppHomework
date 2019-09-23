package homework11.prob1;

import java.util.HashMap;
import java.util.List;

public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		HashMap<Key, Student> hashList = new HashMap<Key, Student>();
		for (Student s : students) {
			hashList.put(new Key(s.getFirstName(), s.getLastName()), s);
		}
		return hashList;
	}
}
