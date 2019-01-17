package ser.dog.data;

public class Dog {
	private int height;
	private String type;
	private String color;
	private String place;
	
	public int getHeight() {
		return height;
	}
	public String getType() {
		return type;
	}
	public String getColor() {
		return color;
	}
	public String getPlace() {
		return place;
	}
	
	public void setHeight(int height) {
		this.height=height;
	}
	public void setType(String type) {
		this.type=type;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public void setPlace(String place) {
		this.place=place;
	}
	public void display() {
		System.out.println("Dog:");
		System.out.println("Type is: "+ type);
		System.out.println("Color is "+ color);
		System.out.println("Place is "+place);
	}
}
