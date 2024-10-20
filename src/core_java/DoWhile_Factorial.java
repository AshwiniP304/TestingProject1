package core_java;

import java.util.Scanner;

public class DoWhile_Factorial 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		boolean b = true;
		do 
		{
			System.out.println("Enter the number");
			int num = sc.nextInt();
			
			//sum= factorial
			
			int sum=1;
			for(int i=1;i<=num;i++)
			{
				sum =sum * i;
			}
			System.out.println("Factorial of "+num+ " is "+ sum);
			System.out.println("Do You want to Continue :'yes', 'no'");
			String dec = sc.next();
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
