package collection;
import java.util.*;
public class SortEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String>al=new ArrayList<String>();
		al.add("bts");
		al.add("txt");
		al.add("exo");
		
		Collections.sort(al);
		Iterator<String> itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}

}
