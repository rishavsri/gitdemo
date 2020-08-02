package collectionss;

import java.util.HashSet;
import java.util.Iterator;

public class Set {

	public static void main(String[] args) 
	{
		
		//HASHSET, TREESET, LINKEDHASHSET implements set interface
		//does not accept duplicate values 
		//There is no guarantee elements stored in sequential order
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("USA");
		hs.add("UK");
		hs.add("linda");
		hs.add("pont");
		hs.add("mickel");
		hs.size();
		hs.isEmpty();
		
		//System.out.println();
		
		//Iterator  
		
		Iterator<String>  iter = hs.iterator();

		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
	}

}
