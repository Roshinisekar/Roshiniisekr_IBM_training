package com;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="jungkook";
		int a=str.length();
		System.out.println(a);
		for(int i=a-1;i>=0;i--)
			System.out.print(str.charAt(i));
		
	}

}
