package telran.product.data;

public class MilkProduct extends Product {
private double fatPercent;

public MilkProduct(long barCode, String name, String category, String brand, double price, double fatPercent) {
	super(barCode, name, category, brand, price);
	this.fatPercent = fatPercent;
}

public double getFatPercent() {
	return fatPercent;
}

public void setFatPercent(double fatPercent) {
	this.fatPercent = fatPercent;
}

@Override
public String toString() {
	return "MilkProduct [fatPercent=" + fatPercent + ", toString()=" + super.toString() + "]";
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	long temp;
	temp = Double.doubleToLongBits(fatPercent);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (!super.equals(obj))
		return false;
	if (getClass() != obj.getClass())
		return false;
	MilkProduct other = (MilkProduct) obj;
	if (Double.doubleToLongBits(fatPercent) != Double.doubleToLongBits(other.fatPercent))
		return false;
	return true;
}




}
