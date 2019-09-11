package homework5.prob2;

import java.time.LocalDate;

public class DeptEmployee {
	protected String name;
	protected double salary;
	protected LocalDate hireDate;
	
	public DeptEmployee(double salary)
	{
		this.salary = salary;
	}
	public double computeSalary()
	{
		return salary;
	}
	public DeptEmployee()
	{}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getHireDate() {
		return hireDate;
	}
	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}
	
	
}
