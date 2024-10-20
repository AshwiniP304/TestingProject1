package core_java;

import java.util.Scanner;

public class StringMethod_Factorial_2403 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		//boolean b = true;
		String dec;

		do
		{
			System.out.println("Enter the number :");
			int num = sc.nextInt();
			
		//sum = factorial
			
			int sum =1;
			for(int i=1;i<=num;i++)
			{
				sum = sum *i;
			}
			System.out.println("Factorial of "+ num+" is "+sum);
			System.out.println("Do You want to continue : 'yes','no'");
			dec = sc.next();
		}
		 while (dec.equals("yes"));
		}

}
