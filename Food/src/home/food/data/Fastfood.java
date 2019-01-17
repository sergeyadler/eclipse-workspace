package home.food.data;

public class Fastfood extends Food {
private String restaurantName;
private int holesterin;
private int speed;
public Fastfood(int calories, String name, double price, int fat, String restaurantName, int holesterin, int speed) {
	super(calories, name, price, fat);
	this.restaurantName = restaurantName;
	this.holesterin = holesterin;
	this.speed = speed;
}
public String getRestaurantName() {
	return restaurantName;
}
public void setRestaurantName(String restaurantName) {
	this.restaurantName = restaurantName;
}
public int getHolesterin() {
	return holesterin;
}
public void setHolesterin(int holesterin) {
	this.holesterin = holesterin;
}
public int getSpeed() {
	return speed;
}
public void setSpeed(int speed) {
	this.speed = speed;
}
@Override
public String toString() {
	return "Fastfood [restaurantName=" + restaurantName + ", holesterin=" + holesterin + ", speed=" + speed
			+ ", toString()=" + super.toString() + "]";
}



}
