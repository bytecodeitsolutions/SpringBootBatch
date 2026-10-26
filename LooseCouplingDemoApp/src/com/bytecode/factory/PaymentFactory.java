package com.bytecode.factory;

import com.bytecode.exception.InvalidPaymentModeException;
import com.bytecode.impl.CreditCard;
import com.bytecode.impl.DebitCard;
import com.bytecode.impl.UPI;
import com.bytecode.in.IPayment;

public class PaymentFactory {
	private static IPayment iPayment = null;

	public static IPayment getPaymentModeObject(String modeName) {
		if (modeName.equals("credit")) {
			iPayment = new CreditCard();
		} else if (modeName.equals("debit")) {
			iPayment = new DebitCard();
		} else if (modeName.equals("upi")) {
			iPayment = new UPI();
		} else {
			throw new InvalidPaymentModeException("please enter a valid mode of transaction");
		}
		return iPayment;
	}
}
