package com.bytecode.bill;

import com.bytecode.in.IPayment;

public class BillCollector {
	public static String payment(IPayment iPayment, double amt) {
		return iPayment.pay(amt);
	}
}
