package ser.dog.controller;

import ser.dog.data.Dog;

public class DogAppl {

	public static void main(String[] args) {
		Dog dog1=new Dog();
		dog1.setHeight(100);
		dog1.setColor("black");
		dog1.setType("Pitbull");
		dog1.setPlace("the USA");
		dog1.display();
		
		Dog dog2=new Dog();
		dog2.setHeight(15);
		dog2.setColor("Brown");
		dog2.setType("Pincher");
		dog2.setPlace("Germany");
		dog2.display();
	}

}
