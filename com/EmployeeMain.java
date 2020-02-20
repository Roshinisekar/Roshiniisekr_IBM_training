package com;

public class EmployeeMain {
	public static void main(String[] args) {
		
		WageEmployee w=new WageEmployee("Jin",1310,510000,"Korea",40,4000);
		System.out.println(w);
		System.out.println(w.calcSalary());
		
		
	}

}

