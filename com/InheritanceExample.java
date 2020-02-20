package com;

class A //parent class
{
	int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	void showClass()    //method overriding
	{
		System.out.println("Class A");
	}
}

class B extends A  //child class
{
	int b;
	@Override
	void showClass() {
		super.showClass();
		System.out.println("Class B");
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
}

public class InheritanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B b=new B();
		System.out.println(b.a);
		b.showClass();

	}

}
