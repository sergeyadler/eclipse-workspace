package home.bank.data;

import java.util.Arrays;

public class BankAccount {
	private int account;
	private Person[] owner;
	private double balance;

	
	public BankAccount(int account, Person[] owner, double balance) {
		super();
		this.account = account;
		this.owner = owner;
		this.balance = balance;
		
	}
	public int getAccount() {
		return account;
	}
	public void setAccount(int account) {
		this.account = account;
	}
	public Person[] getOwner() {
		return owner;
	}
	public void setOwner(Person[] owner) {
		this.owner = owner;
	}
	public double getBalance() {
		return balance;
	}
	
	
	@Override
	public String toString() {
		return "BankAccount [account=" + account + ", owner=" + Arrays.toString(owner) + ", balance=" + balance + "]";
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + account;
		long temp;
		temp = Double.doubleToLongBits(balance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + Arrays.hashCode(owner);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankAccount other = (BankAccount) obj;
		if (account != other.account)
			return false;
		if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance))
			return false;
		if (!Arrays.equals(owner, other.owner))
			return false;
		return true;
	}
	public void debit (double balance, double sum) {
		balance= balance + sum;
		
	}
	public void credit (double balance, double sum) {
		balance= balance - sum;
		
	}


}
