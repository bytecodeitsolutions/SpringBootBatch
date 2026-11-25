package com.bytecode;

import java.util.Scanner;

class Pin {

	static boolean checkPin(int pNo) {

		switch (pNo) {

		case 1111:
			return true;
		case 2222:
			return true;
		case 3333:
			return true;
		case 4444:
			return true;
		default:
			return false;
		}
	}
}

class Student {

	private int rno;
	private String name;
	private int totalMarks;

	public Student(int rno, String name, int totalMarks) {
		this.rno = rno;
		this.name = name;
		this.totalMarks = totalMarks;
	}

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}

	static void isEligibleForLaptop(Student[] s) {

		for (int i = 0; i <= s.length - 1; i++) {

			Student student = s[i];

			if (student.getTotalMarks() >= 400) {
				System.out.println(student.getName() + " is eleigible for Laptop");
			} else {
				System.out.println(student.getName() + " is not eleigible for Laptop");
			}

		}
	}
}

public class ForLoopDemo1 {

	public static void main(String[] args) {
		/*
		 * Student[] students = { new Student(101, "raja", 399), new Student(102,
		 * "rani", 402), new Student(103, "shayni", 420), new Student(104, "faraj",
		 * 399), new Student(104, "kayum", 500) };
		 * 
		 * Student.isEligibleForLaptop(students);
		 */

		Scanner s = new Scanner(System.in);

		System.out.println("please enter a number");
		System.out.println("1 for transaction |  2 for ending transation");
		int i = s.nextInt();

		while (i == 1) {

			System.out.println("pls enter a valid pin");
			int pin = s.nextInt();
			boolean flag = Pin.checkPin(pin);

			if (flag) {
				System.out.println("allowed for transactions");
			} else {
				System.out.println("Not allowed for transactions");
			}
		}

	}

}
