package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestEmployeeSortById {

	public static void main(String[] args) {
		
		List l = new ArrayList();
		
		l.add(new Employee(4,"Rahul",8000));
		l.add(new Employee(2,"Naman",6000));
		l.add(new Employee(3,"Gopal",4000));
		l.add(new Employee(1,"Shubh",10000));
		
		EmployeeSortById byId = new EmployeeSortById();
		
		Collections.sort(l, byId);
		
		Iterator it = l.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
