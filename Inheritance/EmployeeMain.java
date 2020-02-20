package Inheritance;



public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WageEmployee w=new WageEmployee("Jin",1310,510000,"Korea",new Address(1254,"wings",44645),40,4000);
		System.out.println(w);
		System.out.println("Salary:"+w.calcSalary());
		
		Employee e=new Employee("Jimin",8147,610000,"Korea",new Address(1254,"mots",44645));
		System.out.println(e);
		System.out.println("salary:"+e.calcSalary());
		
		Employee l=new Employee("Tae",1587,200000000,"korea",new Address(1212,"BBQ",123456));
		System.out.println(l);

	}

}
