package exercise12;

import java.util.Comparator;

public class DateComparator implements Comparator<Birthday> {

	@Override
	public int compare(Birthday b1, Birthday b2) {
		int result = new Integer(b1.getMonth()).compareTo(new Integer(b2.getMonth()));
		if (result == 0)
			result = new Integer(b1.getDay()).compareTo(new Integer(b2.getDay()));
		if (result == 0)
			result = new Integer(b1.getYear()).compareTo(new Integer(b2.getYear()));
		return result;
	}

}
