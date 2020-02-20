package com;

public class VarArg {
	
	static void Display(int...values) {
		int sum=0;
		for(int Numbers :values) {
			
			sum=sum+Numbers;
			
		}
		
		System.out.println(sum);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Display(10,20,30,40);
	}

}
