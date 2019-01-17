
public class Car extends Auto implements Comparable<Car> {
private int timeToHundred;

public Car(String name, int petrolExpands, int mass, int timeToHundred) {
	super(name, petrolExpands, mass);
	this.timeToHundred = timeToHundred;
	
}

@Override
public String toString() {
	return "Car [timeToHundred=" + timeToHundred + ", toString()=" + super.toString() + "]";
}

public double getTimeToHundred() {
	return timeToHundred;
}

public void setTimeToHundred(int timeToHundred) {
	this.timeToHundred = timeToHundred;
}

@Override
public int compareTo(Car o) {
	if(this.timeToHundred > o.timeToHundred)
		return 1;
	if(this.timeToHundred < o.timeToHundred)
		return -1;
	return 0;
}

}
