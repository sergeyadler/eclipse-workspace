package telran.product.dao;

import telran.product.data.*;

public class Supermarket {

	
	private Product[] products;
	
	private int size;
	
	public Supermarket(int capasity){
		products= new Product[capasity];
		size=0;
	}
	
	public int getSize(){
		return size;
	}
	
	public boolean addProduct(Product product){
		if(size<products.length){
			products[size]=product;
			size++;
			return true;
			}
		return false;
	}
	public boolean removeProduct(Product product){
		System.out.println("Current size is "+ size);
		for (int i = 0; i < size; i++) {
			if(products[i].equals(product)){
				products[i]=products[size-1];
				size--;
				System.out.println("Size after "+ size);
				return true;
			}
			
		}
		return false;
	}
	public boolean deleteProduct(long barCode){
		for (int i = 0; i < size; i++) {
			if(products[i].getBarCode()==barCode){
				products[i]=products[size-1];
				size--;
				return true;
				
			}
			
		}
		return false;
	}
	public Product findBarCode(long barCode){
		for (int i = 0; i < size; i++) {
			if(barCode==products[i].getBarCode()){
				return products[i];
			}
			
		}
		return null;
	}
	
	public Product[] findByCategory(String category, int numberOfItems){
		Product[] p1 = new Product[numberOfItems];
		int size=0;
				for (int i = 0; i < size; i++) {
			if(products[i].getCategory()==category){
				p1[size]=products[i];
				size++;
				
				
			}
			
		}
				return p1;
	}
	public Product[] findByBrand(String brand, int numberOfItems){
		Product[] p2= new Product[numberOfItems];
		int size=0;
		for (int i = 0; i < size; i++) {
			if(products[i].getBrand()==brand){
				p2[size]=products[i];
				size++;
			}
			
		}
		return p2;
	}
	public void display(){
		for (int i = 0; i < size; i++) {
			System.out.println(products[i]);
			
		}
	}
}
