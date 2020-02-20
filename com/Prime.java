package com;

public class Prime {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=22;
		int m;
		//m=num/2;
		m=(int)Math.pow(num,0.5);
		int flag=0;
		for(int i=2;i<=m;i++)
			if(num%i==0)
			{
				flag=1;
				break;
			}
		if(flag==0)
			System.out.println("the number is prime");
		else
			System.out.println("the number is not prime");
		
			
	}

}
