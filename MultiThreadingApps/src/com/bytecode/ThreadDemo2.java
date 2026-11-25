package com.bytecode;
class Thread2 extends Thread{
	 @Override
	public void run() {
		 System.out.println("hello "+Thread.currentThread().getName());
	}
}

class Thread1 extends Thread{
	 @Override
	public void run() {
		 System.out.println(Thread.currentThread().getName());
	}
}

public class ThreadDemo2 {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		Thread1 obj=new Thread1();
		obj.start();
		//obj.start();
		
		Thread2 obj1=new Thread2();
		obj1.start();
	}

}
