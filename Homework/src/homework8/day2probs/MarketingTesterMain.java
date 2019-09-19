package homework8.day2probs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class MarketingTesterMain {

	public static void main(String[] args) {
		List<Marketing> mlist = new ArrayList<Marketing>();
		mlist.add(new Marketing("Jason", "Lenovo", 9000));
		mlist.add(new Marketing("Kidd", "Dell", 500));
		mlist.add(new Marketing("Brown", "HP", 1000));
		mlist.add(new Marketing("Tim", "Acer", 800));
		mlist.add(new Marketing("Duncan", "Sony", 700));
		mlist.add(new Marketing("Todd", "Mac", 1500));
		mlist.add(new Marketing("Jason", "Asus", 9000));
		System.out.println("The size of list: " + mlist.size());
		System.out.println(mlist);
		Comparator<Marketing> cmp = new MarketingComparator();
		Collections.sort(mlist, cmp);
		System.out.println("after sorting");
		System.out.println(mlist);
		
		List<Marketing> moreThan1000 = listMoreThan1000(mlist);
		Collections.sort(moreThan1000, new Comparator<Marketing>() {

			@Override
			public int compare(Marketing o1, Marketing o2) {
				if(o1.getEmployeeName().compareTo(o2.getEmployeeName()) != 0)
					return o1.getEmployeeName().compareTo(o2.getEmployeeName());
				else if(o1.getProductName().compareTo(o2.getProductName()) != 0)
					return o1.getProductName().compareTo(o2.getProductName());
				else 
					return Double.compare(o1.getSalesAmount(), o2.getSalesAmount());
			}
		});
		System.out.println("More than 1000 orderd by emp name: ");
		System.out.println(moreThan1000);
	}

	public static List<Marketing> listMoreThan1000(List<Marketing> list) {
		Iterator<Marketing> itr = list.iterator();
		List<Marketing> tmp = new ArrayList<Marketing>();
		Marketing mrk;
		while(itr.hasNext())
		{
			mrk = itr.next();
			if(mrk.getSalesAmount() >= 1000)
				tmp.add(mrk);
		}
		return tmp;
	}

}
