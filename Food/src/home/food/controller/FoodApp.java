package home.food.controller;

import home.food.data.*;

public class FoodApp {

	public static void main(String[] args) {
	Food f1 = new Food(500, "Pork", 50, 30);
	System.out.println(f1);
	Food f2 = new Food(30, "Carrot", 10.5, 0);
	System.out.println(f2);
	
	Fastfood ff1 = new Fastfood(200, "Hot Dog", 3.50, 100, "Curry36", 20, 10);
	System.out.println(ff1);
	Fastfood ff2 = new Fastfood(150, "Humburger", 5, 20, "McDonalds", 50, 9);
	System.out.println(ff2);
	
	Dietfood df1= new Dietfood(5, "Soja", 8, 0, 12, 0, "B812");
	System.out.println(df1);
	
	Motherfood mf1= new Motherfood(50, "Borsh", 0, 40, 1, 500);
	Motherfood mf2= new Motherfood(50, "Borsh", 0, 40, 1, 500);
	System.out.println(mf1);
	System.out.println(mf2);
	
	boolean res1= mf1.equals(mf2);
	System.out.println(res1);
	
	boolean res2= f1.equals(f2);
	System.out.println(res2);
	
	System.out.println(f1.getClass());
	
	boolean res3 = df1.equals(f1);
	System.out.println(res3);
	
	}

}
