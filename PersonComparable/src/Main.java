import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Person p1 = new Person(15, "Aglaya");
		Person p2 = new Person(44, "Ronald");
		Person p3 = new Person(23, "Monika");
		Person p4 = new Person(77, "Baba Nura");
		Person p5 = new Person(1, "Lulu");
		
		Person [] people = {p1,p2,p3,p4,p5};
		
		for (int i = 0; i < people.length; i++) {
			System.out.println(people[i]);
			
		}
		Arrays.sort(people);
		
		System.out.println("****************************************");
		
		for (int i = 0; i < people.length; i++) {
			System.out.println(people[i]);
		}
		System.out.println("****************************************");
		Arrays.sort(people, new CompareByName());
		System.out.println(Arrays.asList(people));
		
	

	}

}
