package collection;
import java.util.*;
//import java.util.Map.Entry;

public class MapEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map map=new HashMap();//this is being generic
		
		map.put(5,"jimin");
		map.put(2,"jin");
		map.put(7,"jk");
		map.put(3,"suga");
		
		Set set=map.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			Map.Entry entry=(Map.Entry)itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		
		
	}

}
