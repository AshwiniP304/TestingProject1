package core_java;

import java.util.Scanner;

public class NestedIfElse_pinValidation_0303
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Pin");
		int userpin = sc.nextInt();
		
		if (userpin>=1000&&userpin<=9999) 
		{
			if (userpin==9892)
			{
				System.out.println("Access Granted");
			}
			else 
			{
				System.out.println("Access Denied");
			}
		}
		else 
		{
			System.out.println("Pin cannot be more or less than 4 Digit");
		}
	}

}
