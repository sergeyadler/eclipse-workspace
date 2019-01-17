package telran.library.dao;

import telran.library.data.Book;

public class Library {
	
	private Book[]books;
	private int size;
	
	public Library(int capacity) {
		books=new Book[capacity];
	}
	
	public int size() {
		return size;
	}
	
	public boolean addBook(Book book) {
		if(size<books.length) {
			books[size]=book;
			size++;
			return true;
		}
		return false;
	}
	
	public boolean deleteBook(Book book) {
		System.out.println("Current size is"+size);
		for (int i = 0; i < size; i++) {
			if(books[i].equals(book)) {
				books[i]=books[size-1];
				size--;
				System.out.println("Size after"+size);
				return true;
			}
		}
		return false;
	}
	
	public Book getBookByIndex(int index) {
		if(index>size-1) {
			return books[size-1];
		}
		if(index<0) {
			return books[0];
		}
		return books[index];
	}
	
	public int searchBook(Book book) {
		for (int i = 0; i < size; i++) {
			if(books[i].equals(book)) {
				return i;
			}
			
		}
		return -1;
	}
	
	public void display() {
		for (int i = 0; i < size; i++) {
			System.out.println(books[i]);			
		}
	}

}
