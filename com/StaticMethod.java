package com;

public class StaticMethod {
	
	static int a=100;    //static variable
	int b;           //non static and instance variable
	
	static
	{
		//a=7;// static block always before the main() method
		System.out.println("BTS");
	}
	
	
	
	static void setA()
	{
		int c=70;     //local variable must be initialized always
		System.out.println(c);
		System.out.println(a);
		
		//System.out.println(b); cannot access non static variable in static method
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		setA();
		StaticMethod k=new StaticMethod();
		System.out.println(k.b);
	}

}
