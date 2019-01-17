package telran.product.data;

public class VegetableProduct extends Product {
private double veganRate;

public VegetableProduct(long barCode, String name, String category, String brand, double price, double veganRate) {
	super(barCode, name, category, brand, price);
	this.veganRate = veganRate;
}

public double getVeganRate() {
	return veganRate;
}

public void setVeganRate(double veganRate) {
	this.veganRate = veganRate;
}

@Override
public String toString() {
	return "VegetableProduct [veganRate=" + veganRate + ", toString()=" + super.toString() + "]";
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	long temp;
	temp = Double.doubleToLongBits(veganRate);
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
	VegetableProduct other = (VegetableProduct) obj;
	if (Double.doubleToLongBits(veganRate) != Double.doubleToLongBits(other.veganRate))
		return false;
	return true;
}


}
