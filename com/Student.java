package com;

public class Student {

	String stName;
	int stID;
	String StCourse;
	static String collegeName="St.Josephs";

	public String getStName() {
		return stName;
	}

	public void setStName(String stName) {
		this.stName = stName;
	}

	public int getStID() {
		return stID;
	}

	public void setStID(int stID) {
		this.stID = stID;
	}

	public String getStCourse() {
		return StCourse;
	}

	public void setStCourse(String stCourse) {
		this.StCourse = stCourse;
	}
	void setSt(String StName,int StID,String StCourse)
			
	{
		this.stName=StName;
		this.stID=StID;
		this.StCourse=StCourse;
	}
	void showData()
	{
		System.out.println(this.stName);
		System.out.println(this.stID);
		System.out.println(this.StCourse);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		s1.setSt("roshinii",140,"BE");
		System.out.println(Student.collegeName);
		s1.showData();
		Student s2=new Student();
		s2.setSt("jungkook",97, "BTS");
		System.out.println(Student.collegeName);
		s2.showData();

	}

}
