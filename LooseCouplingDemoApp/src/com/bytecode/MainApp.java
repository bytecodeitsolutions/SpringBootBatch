package com.bytecode;

import java.util.Scanner;

import com.bytecode.bill.BillCollector;
import com.bytecode.factory.PaymentFactory;
import com.bytecode.in.IPayment;

public class MainApp {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);//object ko kisne bnaya hai???
		System.out.println("Please enter mode of payment");
		String mode = s1.next();
		System.out.println("Please enter payment amount");
		double amount = s1.nextDouble();
		IPayment x = PaymentFactory.getPaymentModeObject(mode);
		System.out.println(BillCollector.payment(x, amount));
	}

}
