package com;

interface Eatable
{
	void eat();
	
}
public class AnonymousInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Eatable e=new Eatable() 
		{
			public void eat()
			{
				System.out.println("nice fruiuts");
			}
		};
		e.eat();
	}

}
