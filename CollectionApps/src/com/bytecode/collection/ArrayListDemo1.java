package com.bytecode.collection;

import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {

		ArrayList<Customer> al = new ArrayList<Customer>();

		al.add(new Customer(101, "Faraz", 10000.0));
		al.add(new Customer(103, "Kayum", 100.0));
		al.add(new Customer(102, "Geeta", 200.0));
		al.add(new Customer(104, "Mahak", 20000.0));

		System.out.println(al);

		for (Customer customer : al) {
			System.out.println(customer);
		}

	}

}
