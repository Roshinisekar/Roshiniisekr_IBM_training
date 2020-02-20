package collection;

import java.util.*;
class Studentinfo
{
	String Name;
	int age;
	int rollno;
	
	Studentinfo(String Name,int age,int rollno)
	{
		this.Name=Name;
		this.age=age;
		this.rollno=rollno;
	}
}

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Studentinfo>list=new ArrayList<Studentinfo>();
		Studentinfo s1= new Studentinfo("Jungkook",22,100);
		Studentinfo s2=new Studentinfo("Jimin",25,101);
		
		list.add(s1);
		list.add(s2);
		
		Iterator<Studentinfo> itr=list.iterator();
		while(itr.hasNext())
		{
			Studentinfo st=itr.next();
			System.out.println(st.Name+" "+st.age+" "+st.rollno);
		}
		
		

	}

}
