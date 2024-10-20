package core_java;

import java.util.Scanner;

public class String_PinVerification_3103
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Customer ID : ");
		int id = sc.nextInt();
				
		System.out.println("Enter Your Password");
		String str = sc.next();
		
		if (id==889896) 
		{
			if (str.equals("ashwini")) 
			{
				System.out.println("Access Granted");
			} 
			else 
			{
				System.out.println("Invalid password");
			}
		}
		else 
		{
			System.out.println("Invalid Customer ID");
		}
	
	}

}
