package com;

public class FactorialRecursion {

	static int factorial(int num)
	{
		if(num==0||num==1)
			return 1;
		else
			return (num*factorial(num-1)); 
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//FactorialRecursion a=new FactorialRecursion();
		System.out.println("Factorial="+factorial(6));
		

	}

}
