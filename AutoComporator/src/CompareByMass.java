import java.util.Comparator;

public class CompareByMass implements Comparator<Auto> {

	@Override
	public int compare(Auto o1, Auto o2) {
		//return o1.getMass().compareTo(o2.getMass());	
		if(o1.getMass() < o2.getMass())
			return -1;
		if(o1.getMass() > o2.getMass())
			return 1;
		return 0;
	
	}
	}