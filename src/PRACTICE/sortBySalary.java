package PRACTICE;

import java.util.Comparator;

public class sortBySalary implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		System.out.println("Sorted by Salary");
		return (int)(o2.getSalary() - o1.getSalary());
	}

}
