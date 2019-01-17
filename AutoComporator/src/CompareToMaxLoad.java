import java.util.Comparator;

public class CompareToMaxLoad implements Comparator<Truck> {

	@Override
	public int compare(Truck o1, Truck o2) {
		if(o1.getMaxLoad() > o2.getMaxLoad())
			return 1;
		if(o1.getMaxLoad() < o2.getMaxLoad())
			return -1;
		return 0;
		
	}

}
