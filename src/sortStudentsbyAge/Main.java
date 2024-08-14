package sortStudentsbyAge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("Vaishvik",3,323424));
		list.add(new Student("Karan",4,903434));
		list.add(new Student("Kiran",1,523894));
		list.add(new Student("Lala",2,5252334));
		
		
		Collections.sort(list);
		
		for(Student each : list) {
			System.out.println(each);
		}
	}
}
