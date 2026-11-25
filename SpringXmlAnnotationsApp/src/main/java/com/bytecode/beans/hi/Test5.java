package com.bytecode.beans.hi;

import org.springframework.stereotype.Component;
 //  <bean id="t3" class="com.bytecode.beans.Test3"/>
@Component
public class Test5 {
	public Test5() {
		System.out.println("Test5 0 param constructor");
	}
}
