package home.bank.controller;

import home.bank.dao.Bank;
import home.bank.data.*;

public class BankApp {

	public static void main(String[] args) {
		Person p1= new Person(789987, "Harry", "Potter", "England Private Drive 10");
		Person p2 = new Person(789456, "Ilon", "Mask", "Califonia 5avenue 10");
		Person p3 = new Person(147852, "Sqrudge", "McDuck", "Disneyland Duck street 15");
		Person p4 = new Person(7777777, "Donald", "Trump", "White House thr USA");
		
		Person [] owner1= {p1};
		Person [] owner2 = {p2};
		Person [] owner3 = {p3};
		Person [] owner4 = {p4};
		
		
		BankAccount ba1= new BankAccount(7879, owner1, 1000000);
		BankAccount ba2= new BankAccount(98658, owner2, 9900000.9999);
		BankAccount ba3= new BankAccount(123456789, owner3, 999999999);
		BankAccount ba4= new BankAccount(97999789, owner4, 11111111);
		
		
		Bank myBank = new Bank(100);
		myBank.addBankAccount(ba1);
		myBank.addBankAccount(ba2);
		myBank.addBankAccount(ba3);
		myBank.addBankAccount(ba4);
		
		myBank.display();
		
		System.out.println("-----------------------------------------------------------------------------");
		myBank.deleteBankAccount(ba4);
		myBank.display();
		
		System.out.println("------------------------____________---------------------------------");
		
		System.out.println(myBank.searchBankAccount(p3));
		
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println(myBank.searchAccount(ba3));
		System.out.println("-----------------------------------------------------------------------------");
		
		System.out.println(myBank.searchBankAccount(p2));
		
		
		
		

	}

}
