package com;

public class Employee {

	String Employee;
	int empId;
	int empSalary;
	String location;

	@Override
	public String toString() {
		return "Employee [Employee=" + Employee + ", empId=" + empId + ", empSalary=" + empSalary + ", location="
				+ location + "]";
	}

	public Employee(String employee, int empId, int empSalary, String location) {
		super();
		Employee = employee;
		this.empId = empId;
		this.empSalary = empSalary;
		this.location = location;
	}

	public String getEmployee() {
		return Employee;
	}

	public void setEmployee(String employee) {
		Employee = employee;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int calcSalary() {
		return this.empSalary;
	}
	

}
