package com.bytecode.beans;

public class Department {
	private int deptId;
	private String deptName;
	
	public Department() {
		System.out.println("0 param constructor-Dept");
	}

	public Department(int deptId, String deptName) {
		System.out.println("2 param constructor-Dept");
		this.deptId = deptId;
		this.deptName = deptName;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		System.out.println("deptId setter");
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		System.out.println("deptName setter");
		this.deptName = deptName;
	}
}
