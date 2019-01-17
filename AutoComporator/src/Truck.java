
public class Truck extends Auto {



	private int maxLoad;
	

	public int getMaxLoad() {
		return maxLoad;
	}


	public void setMaxLoad(int maxLoad) {
		this.maxLoad = maxLoad;
	}


	public Truck(String name, int petrolExpands, int mass, int maxLoad) {
		super(name, petrolExpands, mass);
		this.maxLoad = maxLoad;
	}


	@Override
	public String toString() {
		return "Truck [maxLoad=" + maxLoad + ", toString()=" + super.toString() + "]";
	}
	

}
