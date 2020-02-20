package com;

//final value,final method,final class


final class car
{
	//final void display()
	void Display()
	{
		System.out.println("Suga");
	}
	void show()
	{
		System.out.println("Suga class");
	}
}


//class Hyundai extends car{ cannot inherit form a class which is declared final
	
	/*@Override
	void display() {
		System.out.println("Min Yoongi");
	}*///cannot override final method
	
//}

public class Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final double pi=3.14; //constant
		System.out.println(pi);
		//pi=3.14; error
		

	}

}
