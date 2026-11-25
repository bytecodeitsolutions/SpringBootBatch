package com.bytecode.beans;

import org.springframework.stereotype.Component;

@Component
public class Test2 {
    public Test2() {
		System.out.println("Test2 class 0 param constructor");
	}
    
    public void m2() {
    	System.out.println("This is from m2 method");
    }
}
