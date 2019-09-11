package homework5.prob2;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		DeptEmployee[] de = new DeptEmployee[5];
		Professor p1 = new Professor(100000);
		p1.setHireDate(LocalDate.now());
		p1.setName("John");
		p1.setNumberOfPublications(4);
		
		Professor p2= new Professor(110000);
		p2.setHireDate(LocalDate.of(2016, 01, 01));
		p2.setName("Peter");
		p2.setNumberOfPublications(5);
		
		Professor p3 = new Professor(120000);
		p3.setHireDate(LocalDate.of(2006, 02, 01));
		p3.setName("James");
		p3.setNumberOfPublications(6);
		de[0] = p1;
		de[1] = p2;
		de[2] = p3;
		
		
		Secretary s1 = new Secretary(80000);
		s1.setOvertimeHours(12);
		s1.setHireDate(LocalDate.of(2011, 02, 02));
		s1.setName("Secretary1");
		
		Secretary s2 = new Secretary(81000);
		s2.setHireDate(LocalDate.of(2012, 03, 03));
		s2.setName("Secretary2");
		s2.setOvertimeHours(13);
		
		de[3] = s1;
		de[4] = s2;
		
		System.out.printf("Do you wish to see total salary in department? (Y/N): ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		if(input.equalsIgnoreCase("y"))
		{
			double ts = 0;
			for(DeptEmployee d: de)
			{
				ts += d.computeSalary();
			}
			System.out.println("Total salary: " + ts);
		}
		sc.close();
		
	}
}
