package com.bytecode.collection;

import java.util.Comparator;
import java.util.TreeSet;
public class SetDemo2 {

	public static void main(String[] args) {
		
		Comparator< Account> comparator=new Comparator<Account>() {
			@Override
			public int compare(Account a1, Account a2) {
			
				return (int) (a1.getBalance()-a2.getBalance());
			}
		};
		
		Comparator<Account> comparator2=(a1,a2)->{
			return (int) (a1.getBalance()-a2.getBalance());
		};
		
		System.out.println(comparator.getClass().getName());
		TreeSet<Account> accounts=new TreeSet<Account>(comparator2);
	
		accounts.add(new Account(1111L,80000.0d,"raja"));
		accounts.add(new Account(2222L,90000.0d,"kaja"));
		accounts.add(new Account(3333L,30000.0d,"paja"));
		accounts.add(new Account(1122L,70000.0d,"aaja"));
		accounts.add(new Account(3322L,40000.0d,"jaja"));
		System.out.println(accounts);
		
	}

}
