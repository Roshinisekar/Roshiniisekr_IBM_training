package Inheritance;

public class Employee {

	String Employee;
	int empId;
	int empSalary;
	String location;
	Address add;

	@Override
	public String toString() {
		return "Employee [Employee=" + Employee + ", empId=" + empId + ", empSalary=" + empSalary + ", location="
				+ location + ", add=" + add + "]";
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	public Employee(String employee, int empId, int empSalary, String location, Address add) {
		super();
		Employee = employee;
		this.empId = empId;
		this.empSalary = empSalary;
		this.location = location;
		this.add = add;
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
