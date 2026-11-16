package com.bytecode.collection;

import java.util.Set;
import java.util.TreeSet;

public class SetDemo1 {
     public static void main(String[] args) {
		Set s1=new TreeSet();
		s1.add(10);
		s1.add(10);
		s1.add(10);
		s1.add(100);
		s1.add(10000);
		s1.add(1);
		s1.add(5);
		
		
		System.out.println(s1);
		
	}
}
