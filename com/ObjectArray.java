package com;

public class ObjectArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account obj[]=new Account[2];
		obj[0]=new Account();
		obj[1]=new Account();
		obj[0].setData(1,2);
		obj[1].setData(3,4);
		obj[0].showData();
		obj[1].showData();

	}
}
	class Account
	{
		int a;
		int b;
		
		public void setData(int c,int d)
		{
			a=c;
			b=d;
		}
		public void showData()
		{
			System.out.println("a="+a);
			System.out.println("b="+b);
		}
	}


