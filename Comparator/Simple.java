package Comparator;
import java.util.*;

public class Simple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student>al=new ArrayList<Student>();
		al.add(new Student(105,"Kim Namjoon",26));
		al.add(new Student(102,"Min Yoongi",27));
		al.add(new Student(109,"Jung Hosek",26));
		
		System.out.println("Sorting by name");
		Collections.sort(al,new Name());
		for(Student st:al)
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		
		System.out.println("Sorting by age");
		Collections.sort(al,new Age());
		for(Student st:al)
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		

	}

}
