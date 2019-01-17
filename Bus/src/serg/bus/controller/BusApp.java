package serg.bus.controller;

import serg.bus.data.Bus;

public class BusApp {

	public static void main(String[] args) {
		Bus b1=new Bus(10, "BMW", "Black", 11);
		Bus b2= new Bus(44, "ZIL", "Pink", 66);		
		Bus b3=new Bus(8, "Paz", "Red", 55);
		Bus b4=new Bus(77, "Audi", "Blue", 22);
		Bus b5=new Bus(22, "Niva", "Yellow", 12);
		Bus b6= new Bus(45, "BMW", "White", 95);
		Bus b7=new Bus(33, "MAN", "Brown", 31);
		Bus b8= new Bus(74, "Scania", "Grey", 85);
		Bus b9= new Bus(25, "Toyota", "Green", 85);
		Bus b10= new Bus(36, "VAZ", "Orange", 456);
			
		Bus r1= new Bus(0);
		Bus r2= new Bus(44);
		Bus r3= new Bus(8);
		Bus r4= new Bus(77);
		Bus r5= new Bus(22);
		Bus r6= new Bus(45);
		Bus r7= new Bus(33);
		Bus r8=new Bus(74);
		Bus r9= new Bus(25);
		Bus r10= new Bus(36);
		
		Bus[] routes= {r1,r2,r3,r4,r5,r6,r7,r8,r9,r10};
		for(int i=0; i<routes.length; i++) {
			routes[i].display1();
		}
	
		
		
		System.out.println("----------------------------------------");
		
		
		
		
		
		Bus[] buses={b1,b2,b3,b4,b5,b6,b7,b8,b9,b10};
		for(int i=0; i<buses.length; i++) {
			buses[i].display();
		}
		
		
		}
		
		
	

}
