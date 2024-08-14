package comperator;

import java.util.Comparator;

public class compareName implements Comparator<StringSortingCompare>{

	@Override
	public int compare(StringSortingCompare o1, StringSortingCompare o2) {
		return (int)(o1.getsName().compareTo(o2.getsName()));
	}



}
