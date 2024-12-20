package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestSortByName {

	public static void main(String[] args) {
		
		List l = new ArrayList();
		
		l.add(new Employee(4,"BB",6000));
		l.add(new Employee(2,"AA",8000));
		l.add(new Employee(1,"DD",7000));
		l.add(new Employee(3,"CC",4000));
		
		EmployeeSortByName byName = new EmployeeSortByName();
		
		Collections.sort(l, byName);
		
//		EmployeeSortBySalary bySalary = new EmployeeSortBySalary();
//		
//		Collections.sort(l, bySalary);
//		
		Iterator it = l.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
