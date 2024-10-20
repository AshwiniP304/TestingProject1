package core_java;

import java.util.Scanner;

public class NestedIfElse_OddEven 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		
		if (num!=0)
		{
			if (num%2==0)
			{
				System.out.println("Even Number");
			}
			else
			{
				System.out.println("Odd Number");
			}
		}
			else
			{
				System.out.println("Should not be zero");
			}
		}
	}


