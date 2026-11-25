package com.bytecode;

class ThreadTest1 extends Thread {

	@Override
	public void run() {
        m1();
		for (int i = 1; i <= 3; i++) {
			System.out.println("Hello run method ::"+Thread.currentThread().getName());
		}
	}
	
	void m1() {
		m2();
		for (int i = 1; i <= 3; i++) {
			System.out.println("Hello m1 method ::"+Thread.currentThread().getName());
		}
	}
	
	void m2() {
		for (int i = 1; i <= 3; i++) {
			System.out.println("Hello m2 method ::"+Thread.currentThread().getName());
		}
	}
}

public class ThreadDemo1 {

	public static void main(String[] args) {

		ThreadTest1 obj = new ThreadTest1();
	
		obj.start();

		for (int i = 1; i <= 3; i++) {
			System.out.println("Hello main method ::"+Thread.currentThread().getName());
		}

	}

}
