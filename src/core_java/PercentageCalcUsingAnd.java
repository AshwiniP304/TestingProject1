package core_java;

import java.util.Scanner;

public class PercentageCalcUsingAnd 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Percentage : ");
		float percentage = sc.nextFloat();
		
		if (percentage>0&&percentage<34.99)
		{
			System.out.println("Sorry! You are Fail");
		}
		else if (percentage>34.99&&percentage<39.99)
		{
			System.out.println("You are Just passed");
		}
		else if (percentage>39.99&&percentage<61) 
		{
			System.out.println("First class");
		}
		else if (percentage>60&&percentage<100)
		{
			System.out.println("Excellent");
		}
	}

}
