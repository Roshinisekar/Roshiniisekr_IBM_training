package com;

class OuterClass
{
	private int a=10;

	class InnerClass1
	{
		void msg()
		{
			System.out.println(a);
		}
	}
}
public class InnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass o=new OuterClass();
		OuterClass .InnerClass1 in=o.new InnerClass1();
		in.msg();

	}

}
