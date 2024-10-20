package core_java;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo_2104
{
	public static void main(String[] args)
	{
		HashSet set = new HashSet();
		
		set.add("hello");
		set.add(1234);
		set.add(true);
		set.add(3.14);
		set.add(null);
		System.out.println(set);
		set.add(false);
		set.remove("hello");
		System.out.println(set);
		
		Iterator it = set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		set.clear();
		System.out.println(set);
	}

}
