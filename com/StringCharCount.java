package com;

public class StringCharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="parkjimimchimmymochi";
		int count=0;
		char a='i';
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==a)
				count++;
		}
		System.out.println(count);
		
		

	}

}
