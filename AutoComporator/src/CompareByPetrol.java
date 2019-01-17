import java.util.Comparator;

public class CompareByPetrol implements Comparator<Auto> {

	@Override
	public int compare(Auto o1, Auto o2) {
		
		if(o1.getPetrolExpands() > o2.getPetrolExpands())
			return 1;
		if(o1.getPetrolExpands()< o2.getPetrolExpands())
			return -1;
		return 0;
	}
	

}
