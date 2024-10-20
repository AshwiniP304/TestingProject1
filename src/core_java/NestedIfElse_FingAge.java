package core_java;

import java.util.Scanner;

public class NestedIfElse_FingAge 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Ajay age");
		int ajayage = sc.nextInt();
		System.out.println("Enter Vijay age");
		int vijayage = sc.nextInt();
		
		if (ajayage!=vijayage)
		{
		
			if (ajayage>vijayage)
			{
			System.out.println("Ajay is big brother");
			}
			else
			{
			System.out.println("Vijay is big brother");
			}
		}	
		else
		{
			System.out.println("Both brother have same age");

		}
	}

}
