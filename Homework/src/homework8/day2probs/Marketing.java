package homework8.day2probs;

import java.util.Comparator;

public class Marketing {
	private String employeeName;
	private String productName;
	private double salesAmount;

	public Marketing(String empName, String prodName, double amount) {
		this.employeeName = empName;
		this.productName = prodName;
		this.salesAmount = amount;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public String getProductName() {
		return productName;
	}

	public double getSalesAmount() {
		return salesAmount;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if ((obj instanceof Marketing) == false)
			return false;
		Marketing mk = (Marketing) obj;
		return (this.employeeName.equals(mk.getEmployeeName()) && this.getProductName().equals(mk.getProductName())
				&& this.getSalesAmount() == mk.getSalesAmount());
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Employee Name :" + this.getEmployeeName() + "\n");
		sb.append("Product Name :" + this.getProductName() + "\n");
		sb.append("Sales Amount :" + this.getSalesAmount() + "\n\n");
		return sb.toString();

	}
}

class MarketingComparator implements Comparator<Marketing> {

	@Override
	public int compare(Marketing o1, Marketing o2) {
		if (Double.compare(o1.getSalesAmount(), o2.getSalesAmount()) != 0)
			return Double.compare(o1.getSalesAmount(), o2.getSalesAmount());
		else if (o1.getEmployeeName().compareTo(o2.getEmployeeName()) != 0)
			return o1.getEmployeeName().compareTo(o2.getEmployeeName());
		else
			return o1.getProductName().compareTo(o2.getProductName());
	}
}
