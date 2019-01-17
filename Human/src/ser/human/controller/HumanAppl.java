package ser.human.controller;

import ser.human.data.Human;

public class HumanAppl {

	public static void main(String[] args) {
		
Human man1=new Human();
man1.setName("Max");
man1.setHeight(182);
man1.setWeight(72);
man1.setAge(22);
man1.setSex("male");
man1.setRace("European");
man1.setEyes("Grey");
man1.setHairColor("Blond");
man1.setNationality("Russian");
man1.display();
System.out.println("**************************************");
Human man2=new Human();
man2.setName("Zacary");
man2.setHeight(182);
man2.setWeight(77);
man2.setAge(27);
man2.setSex("man");
man2.setEyes("blue");
man2.setHairColor("blond");
man2.setRace("Niger");
man2.setNationality("French");
man2.display();
		

	}

}
