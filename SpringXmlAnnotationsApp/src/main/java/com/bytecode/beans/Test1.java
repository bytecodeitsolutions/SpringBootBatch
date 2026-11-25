package com.bytecode.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Test1 {
	
	@Autowired
	private Test2 test2;

	public Test1() {
		System.out.println("Test1 class 0 param constructor");
	}

	public void m1() {
		test2.m2();
	}
}
