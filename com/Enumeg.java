package com;

public class Enumeg {
	
	public enum Members{RM,Jin,Suga,JHope,Jimin,V,Jungkook}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(Members m : Members.values())
		{
			System.out.println(m); 
		}
		System.out.println("\nKim Namjoon is "+Members.valueOf("RM"));
		System.out.println("JImin is: "+Members.valueOf("Jimin").ordinal()); 

	}

}
