package com.bytecode.impl;

import com.bytecode.in.IPayment;

public class DebitCard implements IPayment{

	@Override
	public String pay(double amt) {
		return "payment done of rupess " + amt + " using debit card";
	}

}
