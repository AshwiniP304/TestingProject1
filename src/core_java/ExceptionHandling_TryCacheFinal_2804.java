package core_java;

import java.util.Scanner;

public class ExceptionHandling_TryCacheFinal_2804
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value a : ");
		int a = sc.nextInt();
		System.out.println("Enter value b : ");
		int b = sc.nextInt();
		try 
		{
			System.out.println("hello");
			System.out.println("a/b = "+(a/b));
		}
		catch (Exception e) 
		{
			System.out.println(e);
			
		     //OR
			//display only message
			
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("Hello Everyone");
		}
	}
}
