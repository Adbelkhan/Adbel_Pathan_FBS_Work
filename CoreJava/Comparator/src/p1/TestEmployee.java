package p1;

import java.util.ArrayList;
import java.util.Collections;

class TestEmployee {
	

		public static void main(String[] args) 
		{
			 Employee e1 = new Employee(105, "Amit", 45000);
		     Employee e2 = new Employee(101, "Neha", 35000);
		     Employee e3 = new Employee(103, "Rahul", 40000);
		     Employee e4 = new Employee(102, "Pooja", 30000);
			
			ArrayList<Employee> a1 = new ArrayList<Employee> ();
	        a1.add(e1);
	        a1.add(e2);
	        a1.add(e3);
	        a1.add(e4);
	        
	        System.out.println("Before Sorting");
	        System.out.println(a1);
	        
	        MyIdComparator midc = new MyIdComparator();
	        Collections.sort(a1, midc);
	        
	        System.out.println("\n\n after");
	        System.out.println(a1);
		}

	}


