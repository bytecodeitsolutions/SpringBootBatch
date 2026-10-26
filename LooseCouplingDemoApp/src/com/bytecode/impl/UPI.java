package com.bytecode.impl;

import com.bytecode.in.IPayment;

public class UPI implements IPayment {

	@Override
	public String pay(double amt) {
		return "payment done of rupess " + amt + " using UPI";
	}

}
