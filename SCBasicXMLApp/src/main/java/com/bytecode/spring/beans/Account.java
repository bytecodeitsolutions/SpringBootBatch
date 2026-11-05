package com.bytecode.spring.beans;

public class Account {
	private long accountNumber;
	private double balance;

	public Account(long accountNumber, double balance) {
		System.out.println("2 param constructor executed");
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		System.out.println("setter method for account number executed");
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		System.out.println("setter method for balance executed");
		this.balance = balance;
	}

}
