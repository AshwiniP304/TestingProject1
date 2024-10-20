package core_java;

import java.util.Scanner;

public class WhileLoop_PinWithInfiniteTry
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		while (true)
		{
		System.out.println("Enter Your Pin : ");
		int userpin = sc.nextInt();
		
		if (userpin==9892) 
		{
			System.out.println("Access Granted");
			break;
		}
		else 
		{
			System.out.println("Access Denited");
		}
		}
	}

}
