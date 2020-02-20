package collection;

import java.util.*;
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> arr=new ArrayList<>();
		
		arr.add(1);
		arr.add(156);
		arr.add(46);
		
		ArrayList<Integer> brr=new ArrayList<>();
		
		brr.add(98);
		brr.add(68);
		brr.add(26);
		
		arr.addAll(brr);
		System.out.println(arr);
		
		arr.remove(1);
		System.out.println(arr);
		
	}

}
