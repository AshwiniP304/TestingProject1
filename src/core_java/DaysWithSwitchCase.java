package core_java;

import java.util.Scanner;

public class DaysWithSwitchCase 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Days : \n1.Sunday\n2.Monday\n3.Tuesday\n4.Wednesday\n5.Thusday\n6.Friday\n7.Saturday");
		int day = sc.nextInt();
		
		switch (day)
		{
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5: 
			System.out.println("Thusday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Satuday");
			break;

		default:
			System.out.println("Invalid Day");
			break;
		}
	}
}
