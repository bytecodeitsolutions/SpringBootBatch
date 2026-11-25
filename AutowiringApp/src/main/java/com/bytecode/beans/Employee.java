package com.bytecode.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component 
public class Employee {
	private int empId;
	private String empName;
	
	@Autowired
	private Department department;
	
	public Employee() {
		System.out.println("0 param cons=emp");
	}

	public Employee(Department department) {
		System.out.println("dept param Employee class constructor");
		this.department = department;
	}

	public Employee(int empId, String empName, Department department) {
		System.out.println("3 param cons=emp");
		this.empId = empId;
		this.empName = empName;
		this.department = department;
	}

	public void setEmpId(int empId) {
		System.out.println("empId param setter=emp");
		this.empId = empId;
	}

	public void setEmpName(String empName) {
		System.out.println("empName param setter=emp");
		this.empName = empName;
	}

	public void setDepartment(Department department) {
		System.out.println("dept param setter=emp");
		this.department = department;
	}
	
	public void getEmployeeData() {
		System.out.println("employee id="+empId +" employee name "+empName);
	
	   System.out.println(department.getDeptId() +"  "+department.getDeptName());
	}
}
