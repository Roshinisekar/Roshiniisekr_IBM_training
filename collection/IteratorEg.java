package collection;
import java.util.*;

public class IteratorEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list=new ArrayList<>();
		list.add("Namjoon");
		list.add("Seokjin");
		list.add("Yoongi");
		list.add("Hosek");
		list.add("Jimin");
		list.add("taehyung");
		list.add("Jungkook");
		
		Iterator<String>itr=list.iterator();//now the elements from the list goes to the iterator
		while(itr.hasNext())//terminates when there is no next element
		{
			System.out.println(itr.next());
		}

	}

}
