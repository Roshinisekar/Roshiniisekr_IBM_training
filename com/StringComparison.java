package com;

public class StringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="jungkook";
		String s2="jungkook";//inside string pool
		String s3=new String("jungkook");//inside heap memory
		String s4="kookie";
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.equals(s3));//true
		System.out.println(s1.equals(s4));//false
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		
		

	}

}
