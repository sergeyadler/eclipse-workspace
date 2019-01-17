import java.util.Comparator;

public class CompareByTimeToHundred implements Comparator<Car>{

	@Override
	public int compare(Car o1, Car o2) {
		if(o1.getTimeToHundred() > o2.getTimeToHundred())
			return 1;
		if(o1.getTimeToHundred() < o2.getTimeToHundred())
			return -1;
		return 0;
		
	
	}

}
