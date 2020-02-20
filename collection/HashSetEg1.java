package collection;
import java.util.*;

public class HashSetEg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set=new HashSet<>();
		set.add("jk");
		set.add("jin");
		set.add("v");
		set.add("rm");
		
		/*Iterator<String> itr=set.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());*/
		
		set.remove("jin");
		System.out.println(set);
		set.removeIf(str->str.contains("v"));
		System.out.println(set);
		
	
	}

}
