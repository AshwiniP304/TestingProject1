package core_java;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo_Collections_1404
{
	public static void main(String[] args)
	{
		ArrayList data = new ArrayList();
		
		data.add("Hello");
		data.add(1234);
		data.add(true);
		data.add(3.147);
		data.add(1234);
		data.add(null);
		data.add(null);
		System.out.println(data);
		
		data.add(5, "Java");
		System.out.println(data);
		
		//data.add(1,"Ashwini");
		//System.out.println(data);
		
		data.remove(null);
		System.out.println(data);
		
		System.out.println(data.get(3));
		
		Iterator it = data.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
	    }
//		for(Object da :data)
//		{
//			System.out.println(da);
//		}
	}

}
