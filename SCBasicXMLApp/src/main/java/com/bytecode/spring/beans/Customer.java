package com.bytecode.spring.beans;

public class Customer {
    private String customerName;

	public Customer(String customerName) {
		System.out.println("1 param constructor executed");
		this.customerName = customerName;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		System.out.println("setter method executed");
		this.customerName = customerName;
	}
	
	public void start() {
		System.out.println("start method executed");
	}
	
	public void stop() {
		System.out.println("stop method executed");
	}
}
