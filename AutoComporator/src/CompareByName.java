import java.util.Comparator;

public class CompareByName implements Comparator<Auto> {

	@Override
	public int compare(Auto o1, Auto o2) {
		
		return o1.getName().compareTo(o2.getName());
		
	}

}
