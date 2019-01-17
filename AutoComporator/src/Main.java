import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Car a1= new Car("Lada", 8, 3, 3);
		Car a2 = new Car("BMW", 12, 4, 5);
		Car a3 = new Car("Mercedes", 15, 4, 4);
		Truck a4 = new Truck("Zil", 20, 15, 6);
		Truck a5 = new Truck("MAN", 5, 8, 5);
		Truck a6 = new Truck("Scania", 25, 15, 20);
		
		Auto [] autos= {a1,a2,a3,a4,a5,a6};
		Car [] cars = {a1,a2,a3};
		Truck [] trucks = {a4,a5,a6};
		
		System.out.println("***************** 1 ******************");// sort by name
		Arrays.sort(autos, new CompareByName());
		System.out.println(Arrays.asList(autos));
		System.out.println("***************** 2 ******************");// sort by mass
		Arrays.sort(autos, new CompareByMass());
		System.out.println(Arrays.asList(autos));
		System.out.println("***************** 3 ******************");// sort by petrol
		Arrays.sort(autos, new CompareByPetrol());
		System.out.println(Arrays.asList(autos));
		System.out.println("***************** 4 ******************");//sort by time to 100
		CompareByTimeToHundred c= new CompareByTimeToHundred();
		Arrays.sort(cars,c);
		System.out.println(Arrays.asList(cars));
		System.out.println("***************** 5 ******************");// sort by maxLoad
		CompareToMaxLoad cm= new CompareToMaxLoad();
		Arrays.sort(trucks,cm);
		System.out.println(Arrays.asList(trucks));
	}

}
