package home.food.data;

public class Motherfood extends Food {
private int fresh;
private int paika;
public Motherfood(int calories, String name, double price, int fat, int fresh, int paika) {
	super(calories, name, price, fat);
	this.fresh = fresh;
	this.paika = paika;
}
public int getFresh() {
	return fresh;
}
public void setFresh(int fresh) {
	this.fresh = fresh;
}
public int getPaika() {
	return paika;
}
public void setPaika(int paika) {
	this.paika = paika;
}
@Override
public String toString() {
	return "Motherfood [fresh=" + fresh + ", paika=" + paika + ", toString()=" + super.toString() + "]";
}


}
