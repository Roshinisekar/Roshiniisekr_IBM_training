package com;

public class Studentjava {
	String stName;
	int stId;
	String StCourse;
	static String collegeName="St.Josephs";
	
	Studentjava()
	{
		this.stName="";
		this.stId=101;
		this.StCourse="";
	}
	
	Studentjava(String stName,int StId,String StCourse)
	{
		this.stName=stName;
		this.stId=StId;
		this.StCourse=StCourse;
	}
	public String getStName() {
		return stName;
	}

	public void setStName(String stName) {
		this.stName = stName;
	}

	public int getStId() {
		return stId;
	}

	public void setStId(int stId) {
		this.stId = stId;
	}

	public String getStCourse() {
		return StCourse;
	}

	public void setStCourse(String stCourse) {
		StCourse = stCourse;
	}

	void setSt(String stName,int stId,String stCourse)
	{
		this.stName=stName;
		this.stId=stId;
		this.StCourse=stCourse;
	}
	void printData()
	{
		System.out.println(this.stName);
		System.out.println(this.stId);
		System.out.println(this.StCourse);
		System.out.println(Studentjava.collegeName);
		
	}
	public static void main(String[] args) {
		
		Studentjava s1=new Studentjava();
		s1.getStName();
		s1.getStId();
		s1.getStCourse();
		s1.printData();
		Studentjava s2=new Studentjava("jungkook",97,"BTS");
		s2.printData();
		
		

	}

}
