package com;

public class Bts {

	int id;
	String Name;
	String Course;
	String Branch;
	BtsAddress add;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCourse() {
		return Course;
	}

	public void setCourse(String course) {
		Course = course;
	}

	public String getBranch() {
		return Branch;
	}

	public void setBranch(String branch) {
		Branch = branch;
	}

	public Bts(int id, String name, String course, String branch, BtsAddress add) {
		super();
		this.id = id;
		Name = name;
		Course = course;
		Branch = branch;
		this.add = add;
	}

	
	

	@Override
	public String toString() {
		return "Bts [id=" + id + ", Name=" + Name + ", Course=" + Course + ", Branch=" + Branch + ", add=" + add + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bts b=new Bts(101,"Hobi","Healing","Music",new BtsAddress("Seoul",123456,"Korea",654789));
		System.out.println(b);
		

	}

}
