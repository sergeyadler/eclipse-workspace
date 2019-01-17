package serg.bus.data;

public class Bus {
	private int route;
	private String model;
	private String color;
	private int busNumber;
	public int getRoute() {
		return route;
	}
	
	public Bus(int route) {
		this.route=route;
	}
	
	public Bus(int route, String model, String color, int busNumber) {
		this.route=route;
		this.model=model;
		this.color=color;
		this.busNumber=busNumber;
		
		
		}
	
	
	public void display1() {
		System.out.print( " Route : " + route+ "\t");
		
	}
	
	
	
	public void setRoute(int route) {
		this.route = route;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getBusNumber() {
		return busNumber;
	}
	public void setBusNumber(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void display() {
		System.out.println("Bus : ");
		System.out.println("Route : " + route);
		System.out.println("Color : "+ color);
		System.out.println("Bus number : " + busNumber);
		
	}
	

	
	

}

