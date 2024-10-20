package core_java;

import java.util.HashSet;
import java.util.Scanner;

public class HashSet_StoreUniqueNum_2104
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		HashSet<Integer> unique =new HashSet<Integer>();
		String retry;
		
		do
		{
			System.out.println("Enter the Number");
			int num = sc.nextInt();
			
			unique.add(num);
			System.out.println("If you want to add more data then type 'yes'");
			retry = sc.next();
		}
		while(retry.equals("yes"));
		System.out.println("unique value in the number "+ unique);
	}

}
