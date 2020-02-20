package com;

public class StaticNestedClass {
	
	static int data=7;
	
	static class Inner
	{
		void msg()
		{
			System.out.println("data=" +data);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticNestedClass.Inner obj=new StaticNestedClass.Inner();
		obj.msg();
	}

}
