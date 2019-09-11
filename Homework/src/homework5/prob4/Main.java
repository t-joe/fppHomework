package homework5.prob4;

public class Main {
	public static void main(String[] args)
	{
		Employee[] emp = new Employee[4];
		CommissionEmployee ce = new CommissionEmployee("john", "doe", "123");
		ce.setCommissionRate(50);
		ce.setGrossSale(200);
		
		BasePlusCommissionEmployee bpce = new BasePlusCommissionEmployee("james", "johnson", "456", 500);
		HourlyEmployee he = new HourlyEmployee("wade", "don", "789");
		he.setHours(22);
		he.setWage(500);
		
		SalariedEmployee se = new SalariedEmployee("steve", "hawkings", "1010", 500);
		
		emp[0] = ce;
		emp[1] = bpce;
		emp[2] = he;
		emp[3] = se;
		double totalSalary = 0;
		for(Employee e: emp)
		{
			totalSalary += e.getPayment();
			System.out.println(e.getClass().getSimpleName() + ": "+ e.getSsn());
		}
				
		System.out.println("Total salary: "+totalSalary );
	}
}
