package com;

public class WrapperEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=100;//primitive type
		System.out.println(a);
		
		Integer i=new Integer(0);//wrapper type variable is called object
		
		i=a;   //autoboxing
		System.out.println(i+" Autoboxing");
		
		int b;
		b=i;   //unboxing
		System.out.println(b+" Unboxing");
		
		
		//System.out.println(i.byteValue());

	}

}
