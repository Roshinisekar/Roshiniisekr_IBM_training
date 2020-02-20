package com;

public class Box {
	
	int len,wid,hei;
	
	Box()
	{
		System.out.println("Box()");
	}
	
	Box(int l)
	{
		this();
		System.out.println("Box(l)");
		this.len=l;
	}
	
	Box(int l,int w)
	{
		this(l);
		System.out.println("Box(l,w)");
		this.len=l;
		this.wid=w;
	}
	
	Box(int l,int w,int h)
	{
		this(l,w);
		System.out.println("Box(l,w,h)");
		this.len=l;
		this.wid=w;
		this.hei=h;
		/*System.out.println(this.len);
		System.out.println(this.wid);
		System.out.println(this.hei);*/
	}
	
	void showData()
	{
		System.out.println(this.len);
		System.out.println(this.wid);
		System.out.println(this.hei);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Box b1=new Box();
		b1.showData();
		Box b2=new Box(10);
		b2.showData();
		Box b3=new Box(10,10);
		b3.showData();
		Box b4=new Box(10,10,10);
		b4.showData();
		
	}

}
