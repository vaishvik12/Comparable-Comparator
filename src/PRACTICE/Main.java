package PRACTICE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(12,"Vaishvik",55000.00));
		list.add(new Employee(22,"karan",35000.00));
		list.add(new Employee(3,"laal",65000.00));
		list.add(new Employee(1,"pilla",53000.00));
		
		System.out.println("Sorted by Name in descending order");
		Collections.sort(list, new sortByName());
		for(Employee each : list) {
			System.out.println(each);
		}
		System.out.println("\nSorted by Id in ascending order\n");
		Collections.sort(list, new sortById());
		for(Employee each : list) {
			System.out.println(each);
		}
		System.out.println("\nSorted by Salary in descending order\n");
		Collections.sort(list, new sortBySalary());
		for(Employee each : list) {
			System.out.println(each);
		}
	}
}
