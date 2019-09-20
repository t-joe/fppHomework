package homework5.prob4;

public class Main {
	public static void main(String[] args)
	{
		Employee[] emp = new Employee[4];
		CommissionEmployee ce = new CommissionEmployee("john", "doe", "123", 50, 200);
		//ce.setCommissionRate(50.0);
		//ce.setGrossSale(200.0);
		
		BasePlusCommissionEmployee bpce = new BasePlusCommissionEmployee("james", "johnson", "456", 500, 50, 200);
		HourlyEmployee he = new HourlyEmployee("wade", "don", "789");
		he.setHours(22);
		he.setWage(500);
		
		SalariedEmployee se = new SalariedEmployee("steve", "hawkings", "1010", 500);
		
		//ce.setCommissionRate(500.0);
		//ce.setGrossSale(300.0);
		
		emp[0] = ce;
		emp[1] = bpce;
		emp[2] = he;
		emp[3] = se;
		
		//should be 10500;
		System.out.println(bpce.getPayment());
		
		double totalSalary = 0;
//		for(Employee e: emp)
//		{
//			totalSalary += e.getPayment();
//			System.out.println(e.toString());
//		}
				
		//System.out.println("Total salary: "+totalSalary );
	}
}
