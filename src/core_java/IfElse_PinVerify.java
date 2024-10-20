package core_java;

import java.util.Scanner;

public class IfElse_PinVerify 
{

	public static void main(String[] args) 
	{
		int pin =9892;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Pin");
		int p = sc.nextInt();
		
		if (pin==p)
		{
			System.out.println("Your pin is correct");
		}
		else 
		{
			System.out.println("Incorrect Pin");
		}
		
	}

}
