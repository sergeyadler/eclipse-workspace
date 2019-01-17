
public class Auto {
	private String name;
	private int petrolExpands;
	private int mass;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPetrolExpands() {
		return petrolExpands;
	}
	public void setPetrolExpands(int petrolExpands) {
		this.petrolExpands = petrolExpands;
	}
	public int getMass() {
		return mass;
	}
	public void setMass(int mass) {
		this.mass = mass;
	}
	public Auto(String name, int petrolExpands, int mass) {
		super();
		this.name = name;
		this.petrolExpands = petrolExpands;
		this.mass = mass;
	}
	@Override
	public String toString() {
		return "Auto [name=" + name + ", petrolExpands=" + petrolExpands + ", mass=" + mass + "]";
	}
	

}
