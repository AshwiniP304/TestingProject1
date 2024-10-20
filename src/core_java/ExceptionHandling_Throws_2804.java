package core_java;

import java.util.Scanner;

public class ExceptionHandling_Throws_2804 
{
	public static void main(String[] args) throws Exception 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value a : ");
		int a = sc.nextInt();
		System.out.println("Enter value b : ");
		int b = sc.nextInt();
		try 
		{
			System.out.println("a/b = "+(a/b));
		}
		catch (Exception e) 
		{
			System.out.println(e);
			
		}
		finally
		{
			Thread.sleep(2000);
			System.out.println("Hello Everyone");
		}

	}

}
