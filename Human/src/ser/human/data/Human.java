package ser.human.data;

public class Human {

	private String name;
	private int height;
	private double weight;
	private int age;
	private String sex;
	private String race;
	private String eyes;
	private String haircolor;
	private String nationality;
	
	
	
	public String getName() {
		return name;
	}
	public int getHeight () {
		return height;
	}
	public double getWeight() {
		return weight;
	}
	public int getAge() {
		return age;
	}
	public String getSex() {
		return sex;
	}
	
	public String getRace() {
		return race;
		
	}
	public String getEyes() {
		return eyes;
	}
	public String getHairColor() {
		return haircolor;
		
	}
	public String getNationality() {
		return nationality;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public void setHeight(int height) {
		this.height=height;
		
	}
	public void setWeight(double weight) {
		this.weight=weight;
	}
	public void setAge(int age) {
		this.age=age;
		
	}
	public void setSex(String sex) {
		this.sex=sex;
	}
	public void setRace(String race) {
		this.race=race;
	}
	public void setEyes(String eyes) {
		this.eyes=eyes;
	}
	public void setHairColor(String haircolor) {
		this.haircolor=haircolor;
	}
	public void setNationality(String nationality) {
		this.nationality=nationality;
		
	}
	public void display() {
		System.out.println("Human");
		System.out.println("Name is: "+ name);
		System.out.println("Height is: "+ height);
		System.out.println("Weight is: "+ weight);
		System.out.println("Age is: "+ age);
		System.out.println("Sex is: "+sex);
		System.out.println("Eyes are : "+ eyes);
		System.out.println("Hair colours is : "+ haircolor);
		System.out.println("Nationality is: "+ nationality);
		
	}
	
	
	
}
