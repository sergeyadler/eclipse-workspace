package home.food.data;

public class Dietfood extends Food {
private int protein;
private int sugar;
private String meneral;
public Dietfood(int calories, String name, double price, int fat, int protein, int sugar, String meneral) {
	super(calories, name, price, fat);
	this.protein = protein;
	this.sugar = sugar;
	this.meneral = meneral;
}
public int getProtein() {
	return protein;
}
public void setProtein(int protein) {
	this.protein = protein;
}
public int getSugar() {
	return sugar;
}
public void setSugar(int sugar) {
	this.sugar = sugar;
}
public String getMeneral() {
	return meneral;
}
public void setMeneral(String meneral) {
	this.meneral = meneral;
}
@Override
public String toString() {
	return "Dietfood [protein=" + protein + ", sugar=" + sugar + ", meneral=" + meneral + ", toString()="
			+ super.toString() + "]";
}



}
