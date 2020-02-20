package com;

public class Boxeg {

	int len;
	int wid;
	int hei;
	static String BoxCompany = "TXT";
	static int count=0;

	static void Change(String BoxCompany)
	{
		Boxeg.BoxCompany="BTS";
	}
	
	public int getLen() {
		return len;
	}

	public void setLen(int len) {
		this.len = len;
	}

	public int getWid() {
		return wid;
	}

	public void setWid(int wid) {
		this.wid = wid;
	}

	public int getHei() {
		return hei;
	}

	public void setHei(int hei) {
		this.hei = hei;
	}
	
	Boxeg()
	{
		this.len=10;
		this.wid=5;
		this.hei=5;
		count++;
	}
	
	Boxeg(int l,int w,int h)
	{
		this.len=l;
		this.wid=w;
		this.hei=h;
		count++;
	}
	
	void CalculateVolume(int l,int w,int h)
	{
		int vol=0;
		vol=l*w*h;
		System.out.println("Volume="+vol);
	}
	void Volume()
	{
		System.out.println("Volume="+this.len*this.wid*this.hei);
	}
	
	void ShowBox()
	{
		System.out.println("length="+this.len);
		System.out.println("width="+this.wid);
		System.out.println("height="+this.hei);
		System.out.println(Boxeg.BoxCompany);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Boxeg b1=new Boxeg();
		b1.Volume();
		Boxeg b2= new Boxeg();
		b2.CalculateVolume(2,2,2);
		b2.ShowBox();
		System.out.println(Boxeg.count);
		

	}

}
