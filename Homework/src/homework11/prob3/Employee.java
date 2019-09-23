package homework11.prob3;

public class Employee {
	private String name;
	private int salary;
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override 
	public String toString() {
		return "(" + name + ", " + salary + ")";
	}
	@Override
	public boolean equals(Object ob)
	{
		if(ob == null)return false;
		if(!(ob instanceof Employee)) return false;
		Employee emp = (Employee)ob;
		return (this.getName().equals(emp.getName()) && this.getSalary() == emp.getSalary());
	}
}
