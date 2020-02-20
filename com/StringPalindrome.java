package com;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="malayalam";
		int i = 0;
		int j=str.length()-1;
		int flag=0;
		
			while(i<j)
			{
				if(str.charAt(i)!=str.charAt(j))
				{
					flag=1;
				}
				i++;
				j--;
			}
		
		if(flag==0)
			System.out.println("palaindrome");
		else
			System.out.println("not palindrome");
	}
}

