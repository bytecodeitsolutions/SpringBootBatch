package com.java;

public class StudentData {
	int[][] A = { { 6, 7 }, { 8, 8 } };

	Student getMethod() {
		return new Student();
	}

	public static void main(String[] args) {
		
		StudentData s1 = new StudentData();
		Student Data = s1.getMethod();

		System.out.println(Data.B[0][0]);
	}
}
