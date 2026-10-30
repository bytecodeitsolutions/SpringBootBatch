package com.bytecode.collection;


public class Customer {
	private int cId;
	

	private String cName;
	private double amt;

	public Customer(int cId, String cName, double amt) {
		this.cId = cId;
		this.cName = cName;
		this.amt = amt;
	}

	public int getcId() {
		return cId;
	}

	public String getcName() {
		return cName;
	}

	public double getAmt() {
		return amt;
	}
	
	@Override
	public String toString() {
		return "Customer [cId=" + cId + ", cName=" + cName + ", amt=" + amt + "]";
	}
}
