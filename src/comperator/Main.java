package comperator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<StringSortingCompare> list = new ArrayList<>();
		list.add(new StringSortingCompare("Vaishvik",2,99));
		list.add(new StringSortingCompare("Raja",1,45));
		list.add(new StringSortingCompare("Hritvik",3,87));
		list.add(new StringSortingCompare("Paras",5,89));
		
		Collections.sort(list,new compareName());
		for (StringSortingCompare each : list) {
		System.out.println(each);
		}
		
	}
}
