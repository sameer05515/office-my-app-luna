package com.sample.model;

 

public class Account {
	private Integer balance;
	private String accountHolderName;
	public Account() {}
	public Integer getBalance() {
		return balance;
	}
	public void setBalance(Integer balance) {
		this.balance = balance;
	}
	public Account(Integer balance) {
		super();
		this.balance = balance;
	}
	public void withdraw(int money) {
		balance -= money;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Account holders current balance : "+balance;
	}
	
}