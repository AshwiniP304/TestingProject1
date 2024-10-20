package core_java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayList_SortPrimeNumber_1404
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value :");
		int limit = sc.nextInt();
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		for(int i=2;i<limit;i++)
		{
			boolean b = true;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					b= false;
				}
			}
			if(b)
			{
				num.add(i);
			}
		}
		System.out.println(num);
	}
}
