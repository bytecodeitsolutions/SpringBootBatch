package com.bytecode.collection;
import java.util.HashSet;


public class EnumerationDemo1 {

	public static void main(String[] args) {

		HashSet<Integer> integers = new HashSet<Integer>();

		for (int i = 0; i < 10; i++) {
			integers.add(i);
		}
	}

}
