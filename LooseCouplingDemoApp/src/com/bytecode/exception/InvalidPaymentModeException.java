package com.bytecode.exception;

public class InvalidPaymentModeException extends RuntimeException {
	public InvalidPaymentModeException(String msg) {
		super(msg);
	}
}
