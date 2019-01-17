package telran.product.data;

public class Product {
private long barCode;
private String name;
private String category;
private String brand;
private double price;


public Product(long barCode, String name, String category, String brand, double price) {
	super();
	this.barCode = barCode;
	this.name = name;
	this.category = category;
	this.brand = brand;
	this.price = price;
}


public long getBarCode() {
	return barCode;
}


public void setBarCode(long barCode) {
	this.barCode = barCode;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getCategory() {
	return category;
}


public void setCategory(String category) {
	this.category = category;
}


public String getBrand() {
	return brand;
}


public void setBrand(String brand) {
	this.brand = brand;
}


public double getPrice() {
	return price;
}


public void setPrice(double price) {
	this.price = price;
}


@Override
public String toString() {
	return "Product [barCode=" + barCode + ", name=" + name + ", category=" + category + ", brand=" + brand + ", price="
			+ price + "]";
}


@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + (int) (barCode ^ (barCode >>> 32));
	result = prime * result + ((brand == null) ? 0 : brand.hashCode());
	result = prime * result + ((category == null) ? 0 : category.hashCode());
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	long temp;
	temp = Double.doubleToLongBits(price);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	return result;
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Product other = (Product) obj;
	if (barCode != other.barCode)
		return false;
	if (brand == null) {
		if (other.brand != null)
			return false;
	} else if (!brand.equals(other.brand))
		return false;
	if (category == null) {
		if (other.category != null)
			return false;
	} else if (!category.equals(other.category))
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
		return false;
	return true;
}



}
