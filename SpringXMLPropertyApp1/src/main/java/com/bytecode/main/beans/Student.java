package com.bytecode.main.beans;

public class Student {
	private int rno;
	private String name;
	private String address;
	private String course;
	private double fee;
	
	public Student() {
		System.out.println("student 0 param constructor");
	}

	public Student(int rno, String name, String address, String course, double fee) {
		this.rno = rno;
		this.name = name;
		this.address = address;
		this.course = course;
		this.fee = fee;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public void displayStudentData() {
		System.out.println(rno + " " + name + " " + address + " " + course + " " + fee);
	}
}
