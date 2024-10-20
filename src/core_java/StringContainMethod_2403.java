package core_java;

import java.util.Scanner;

public class StringContainMethod_2403 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String Value :");
		String str = sc.nextLine();
		
		String str2 = "Smartphone Device";
		
		boolean b = str2.contains(str);
		//System.out.println(b);
		
		if (b)
		{
			System.out.println("Contain has been found during search");
		} 
		else
		{
			System.out.println("Contain has been not found during search");
		}
	}

}
