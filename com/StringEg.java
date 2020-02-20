package com;

public class StringEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Bangtan Sonyeondan";
		System.out.println(str.charAt(3));
		System.out.println(str.codePointAt(3));//returns unicode value
		System.out.println(str.concat("BTS"));
		
		String str1=new String("Bulletproof boys");
		System.out.println(str1);
		
	}

}
