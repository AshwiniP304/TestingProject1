package core_java;

import java.util.Scanner;

public class DoWhile_Pin
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		boolean b = true;
		do
		{
			System.out.println("Enter your Pin : ");
			int userpin = sc.nextInt();
			
			if (userpin==9892)
			{
				System.out.println("Access Granted");
				break;
			}
			else 
			{
				System.out.println("Access Denied");
			}
			System.out.println("Do You want to continue : 'Yes' , 'No'");
			String dec =sc.next();
			switch (dec) 
			{
			case "yes":
				b= true;
				break;
			case "no":
				b= false;
				break;
				
			default:
				System.out.println("Invalid has been selected");
				b= false;
				break;
			}
		}
			while (b);
		
		
		}
}
	


