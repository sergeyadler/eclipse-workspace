package telran.product.controller;

import telran.product.dao.Supermarket;
import telran.product.data.MilkProduct;
import telran.product.data.VegetableProduct;

public class ProductApp {

	public static void main(String[] args) {
		MilkProduct m1=new MilkProduct(7876, "Moloko", "Milk", "Milka", 3.5, 0.028);
		MilkProduct m2=new MilkProduct(34565, "klin", "quark", "Milchenko", 1.2, 0.1);
		VegetableProduct v1= new VegetableProduct(1231, "Carrot", "vegetables",	"B+	", 1.3,1);
		VegetableProduct v2 = new VegetableProduct(12123123, "Suppe", "Veg", "galinablanka", 3.90, 14);
		
		Supermarket s1= new Supermarket(10);
		s1.addProduct(m1);
		s1.addProduct(v1);
		s1.addProduct(m2);
		s1.addProduct(v2);
		
		System.out.println(s1.getSize());
		
		s1.findBarCode(7876);
		System.out.println(s1.findBarCode(7876));
		s1.deleteProduct(1231);
		
		s1.display();
		System.out.println("********************");
		s1.deleteProduct(7876);
		s1.display();
		

	}

}
