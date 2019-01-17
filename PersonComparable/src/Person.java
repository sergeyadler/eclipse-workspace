
public class Person implements Comparable<Person> {
private int age;
private String name;
public Person(int age, String name) {
	super();
	this.age = age;
	this.name = name;
}
public int getAge() {
	return age;
}
public String getName() {
	return name;
}
@Override
public String toString() {
	return "Person [age=" + age + ", name=" + name + "]";
}
@Override
public int compareTo(Person arg0) {
	if(this.age > arg0.age)
		return 1;
	if(this.age < arg0.age)
		return -1;
	
	return 0;
}



}
