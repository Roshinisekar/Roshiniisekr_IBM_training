package Inheritance;


public class WageEmployee extends Employee {

	int hours;
	int rate;
	@Override
	public String toString() {
		return "WageEmployee [hours=" + hours + ", rate=" + rate + ", Employee=" + Employee + ", empId=" + empId
				+ ", empSalary=" + empSalary + ", location=" + location + ", add=" + add + "]";
	}


	
	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	

	public WageEmployee(String employee, int empId, int empSalary, String location,Address add, int hours, int rate) {
		super(employee, empId, empSalary, location, add);
		// TODO Auto-generated constructor stub

		this.hours = hours;
		this.rate = rate;

	}

	@Override
	public int calcSalary() {
		
		return(super.calcSalary()+this.hours*this.rate);
	}
}
