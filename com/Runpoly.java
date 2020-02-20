package com;



class Shape1
{
	void draw()
	{
		System.out.println("DNA");
	}
}
class Rectangle1 extends Shape1
{
	void draw()
	{
		System.out.println("Fake Love");
	}
}
class Circle1 extends Shape1
{
	void draw()
	{
		System.out.println("Idol");
	}
}
class Triangle1 extends Shape1
{
	void draw()
	{
		System.out.println("Euphoria");
	}
}
	
public class Runpoly {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape1 s;
		s=new Rectangle1();
		s.draw();
		s=new Circle1();
		s.draw();
		s=new Triangle1();
		s.draw();

		
	}

}
