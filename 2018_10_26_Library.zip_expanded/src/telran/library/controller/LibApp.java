package telran.library.controller;

import telran.library.dao.Library;
import telran.library.data.Book;

public class LibApp {

	public static void main(String[] args) {
		
		String [] auth1 = {"Pushkin"};
		String [] auth2 = {"Lermontov"};
		String [] auth3 = {"Ilf", "Petrov"};
		String [] auth4 = {"Karl Marx", "Engels"};
		String [] auth5 = {"A", "B"};
		
		Book b1= new Book("Onegin", auth1, 236, 777);
		Book b2 =new Book("Heroes", auth2, 200, 888);
		Book b3=new Book("12 Chairs", auth3, 120, 900);
		Book b4 = new Book("Das Kapital", auth4, 1000, 444);
		Book b5 = new Book("C", auth5, 100, 455);
		
		Library myLib = new Library(100);
		myLib.addBook(b1);
		myLib.addBook(b2);
		myLib.addBook(b3);
		myLib.addBook(b4);
		myLib.addBook(b5);
		
		myLib.display();
		System.out.println("****************");
		
		myLib.deleteBook(b4);
		myLib.display();
		System.out.println("******************");
		
		System.out.println(myLib.searchBook(b4));
		
		System.out.println(myLib.size());
		int a=myLib.size();
		System.out.println(a);
		

	}

}
