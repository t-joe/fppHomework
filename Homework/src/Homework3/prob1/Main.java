package Homework3.prob1;

public class Main {

	public static void main(String[] args) {
		Customer[] clist = new Customer[5];
		Customer c = new Customer("John", "Doe", "123456789");
		c.setBillingAddress("1", "Chicago", "Illinoise", "5525");
		c.setShippingAddress("1", "Chicago", "Illinoise", "5525");
		
		Customer c1 = new Customer("Joe", "Kingman", "123456789");
		c1.setBillingAddress("1", "San fancisco", "California", "5525");
		c1.setShippingAddress("1", "San fancisco", "California", "5525");
		
		Customer c2 = new Customer("Mc", "Donalds", "123456789");
		c2.setBillingAddress("1", "San Diago", "California", "5525");
		c2.setShippingAddress("1", "San Diago", "California", "5525");
		
		Customer c3 = new Customer("Mike", "Johnson", "123456789");
		c3.setBillingAddress("1", "Los Angelos", "California", "5525");
		c3.setShippingAddress("1", "Los Angelos", "California", "5525");
		
		Customer c4 = new Customer("Larry", "Brown", "123456789");
		c4.setBillingAddress("1", "Chicago", "Illinoise", "5525");
		c4.setShippingAddress("1", "Chicago", "Illinoise", "5525");
		
		clist[0] = c;
		clist[1] =c1;
		clist[2] = c2;
		clist[3] =c3;
		clist[4] = c4;
		
		for(Customer cc: clist)
		{
			if(cc.getBillingAddress().getCity().equalsIgnoreCase("Chicago"))
				System.out.println(cc.toString());
		}
	}

}
