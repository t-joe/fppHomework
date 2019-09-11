package homework5.prob2;

public class Secretary extends DeptEmployee{
	private double overtimeHours;
	
	@Override
	public double computeSalary()
	{
		return salary + 12 * overtimeHours;
	}
	public Secretary(double salary)
	{
		super(salary);
	}
	public double getOvertimeHours() {
		return overtimeHours;
	}

	public void setOvertimeHours(double overtimeHours) {
		this.overtimeHours = overtimeHours;
	}
	
}
