package PRACTICE;

import java.util.Comparator;

public class sortByName implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		return (int)(e2.getName().compareTo(e1.getName()));
	}

}
