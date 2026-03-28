package p1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Test {

	public static void main(String[] args) {
		ArrayList<Employee> a1=new ArrayList<Employee>();
		a1.add(new Employee(10,"Sachin",20000));
		a1.add(new Employee(18,"Virat",25000));
		a1.add(new Employee(12,"Yuvi",19000));
		a1.add(new Employee(5,"Rahul",35000));
		
		Collections.sort(a1,new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o1.getId()-o2.getId();
			}
		});
		System.out.println("Sorted by ID");
		System.out.println(a1);
		System.out.println("\n");
		//for name
		//for salary
		
		Collections.sort(a1, new Comparator<Employee>() {

		    @Override
		    public int compare(Employee o1, Employee o2) {
		        return o1.getName().compareTo(o2.getName());
		    }
		});

		System.out.println("Sorted by Name");
		System.out.println(a1);
	    System.out.println("\n");
		
		Collections.sort(a1, new Comparator<Employee>() {

		    @Override
		    public int compare(Employee o1, Employee o2) {
		        return Double.compare(o1.getSalary(), o2.getSalary());
		    }
		});

		System.out.println("Sorted by Salary");
		System.out.println(a1);

	}

}
