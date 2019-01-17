package home.bank.dao;

import home.bank.data.BankAccount;
import home.bank.data.Person;


public class Bank {
	private BankAccount[] accounts;
	private int size;
	
	
	
	
	public Bank (int capacity) {
		accounts = new BankAccount [capacity=100];
	}
	

	public int getSize() {
		return size;
	}
	
	public boolean addBankAccount(BankAccount account) {
		if(size<accounts.length) {
			accounts[size]=account;
			size++;
			return true;
		}
		return false;
	}
	
	public boolean deleteBankAccount(BankAccount account) {
		System.out.println("Current size is "+size);
		for (int i = 0; i < size; i++) {
			if(accounts[i].equals(account)) {
				accounts[i]=accounts[size-1];
				size--;
				System.out.println("Size after "+size);
				return true;
			}
		}
		return false;
	}
	
	public BankAccount getBankAccountByIndex(int index) {
		if(index>size-1) {
			return accounts[size-1];
		}
		if(index<0) {
			return accounts[0];
		}
		return accounts[index];
	}
	
	public int searchAccount(BankAccount account) {
		for (int i = 0; i < size; i++) {
			if(accounts[i].equals(account)) {
				return i;
			}
			
		}
		return -1;
	}
	
	public int searchBankAccount(Person id) {
		for(int i =0; i<size; i++) {
			if(id.equals(id)) {
				return i;
			}
		}
		return -1;
		
	}
	
	
		
		
	
	public void display() {
		for (int i = 0; i < size; i++) {
			System.out.println(accounts[i]);			
		}
	}
	
	

}
