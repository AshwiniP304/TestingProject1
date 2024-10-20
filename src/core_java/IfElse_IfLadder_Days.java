package core_java;

import java.util.Scanner;

public class IfElse_IfLadder_Days 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Day Number : \n1).Monday\n2).Tuesday\n3).Wednesday\n4).Thusday\n5).Friday\n6).Saturday\n7).Sunday");
		int day = sc.nextInt();
		
		if (day==1) 
		{
			System.out.println("Monday");
		}
		else if (day==2)
		{
			System.out.println("Tuesday");
		}
		else if (day==3) 
		{
			System.out.println("Wednesday");
		}
		else if (day==4)
		{
			System.out.println("Thusday");
		}
		else if (day==5) 
		{
			System.out.println("Friday");
		}
		else if (day==6)
		{
			System.out.println("Saturday");
		}
		else if (day==7) 
		{
			System.out.println("Sunday");
		}
		else
		{
			System.out.println("Invalid Number for day");
		}
	}

}
