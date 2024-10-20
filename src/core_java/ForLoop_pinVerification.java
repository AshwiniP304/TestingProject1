package core_java;

import java.util.Scanner;

public class ForLoop_pinVerification
{

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		for(int i=2;i>=0;i--)
		{
		System.out.println("Enter You Pin : ");
		int pin = sc.nextInt();
		
		if (pin==9892) 
		{
			System.out.println("Access Granted");
		}
		else if (i==0)
		{
			System.out.println("Your card has been bloacked please contact your neartest branch");
		}
		else 
		{
			System.out.println("Access Denied");
			System.out.println(i + " Attempt is left");
		}
	}
	}		
}
