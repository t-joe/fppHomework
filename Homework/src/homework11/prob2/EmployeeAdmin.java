package homework11.prob2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class EmployeeAdmin {
	/**
	 * Returns a list of Employees whose social security number is on the input list
	 * socSecNums and whose salary is > 80000. The list must be ordered by social
	 * security number, from lowest to highest. To sort, you must use a Collections
	 * sorting method and you must define your own Comparator to be used to compare
	 * Employees by ssn.
	 */
	public static List<Employee> prepareReport(HashMap<String, Employee> table, List<String> socSecNums) {
		List<Employee> empList = new ArrayList<Employee>();
		Employee emp;
		for(String str: socSecNums)
		{
			emp = table.get(str);
			if(emp != null && emp.getSalary() > 80000)
				empList.add(emp);
		}
		Comparator<Employee> eComp = new empCompare();
		Collections.sort(empList, eComp);
		return empList;
	}
}
class empCompare implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getSsn().compareTo(o2.getSsn());
	}
	
}
