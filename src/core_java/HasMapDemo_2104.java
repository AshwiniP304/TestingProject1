package core_java;

import java.util.HashMap;

public class HasMapDemo_2104 
{

	public static void main(String[] args)
	{
		HashMap map = new HashMap();
		map.put("101", "hello");
		map.put(102, "hello");
		map.put(true, 1234);
		map.put(2.314, null);
		System.out.println(map.get(102));
		
		System.out.println(map);
		
		System.out.println(map.keySet());
		for(Object h:map.keySet())
		{
			System.out.println(h+" "+map.get(h));
		}
		boolean b = map.containsKey(101);
		boolean b1 = map.containsValue("null");
		System.out.println();
		System.out.println(map.get(true).equals("hello"));

		//System.out.println(b1);
	}

}
