package core_java;

import java.util.Scanner;

public class DoWhile_AreaOfSquare_3103
{

	public static void main(String[] args)
	{
		boolean b = false;
		do
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Area of Side of Square :");
		double s = sc.nextDouble();
		
		if (s!=0)
		{
			System.out.println("Area of Square is "+s*s);
			
			System.out.println("Do You wnat to continue : 'yes','no'");
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
				b = false;
				break;
			}
		}
		else 
		{
			System.out.println("Side value cant be zero");
		}
		}
		while (b);

	}

}
