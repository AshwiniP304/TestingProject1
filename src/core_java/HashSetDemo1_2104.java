package core_java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class HashSetDemo1_2104 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		HashSet<Integer> unique = new HashSet<Integer>();
		String retry;
		do
		{
			System.out.println("Enter a value");
			int num = sc.nextInt();
			list.add(num);
			
			System.out.println("If you want to add more data then type 'yes' ");
			retry = sc.next();
		} 
		while (retry.equals("yes"));
		
		for(Integer uni : list)
		{
			unique.add(uni);
		}
		list.clear();
		
		Iterator<Integer> it = unique.iterator();
		while(it.hasNext())
		{
			list.add(it.next());
		}
		System.out.println("Unique value in he arraylist is"+list);
	}

}
