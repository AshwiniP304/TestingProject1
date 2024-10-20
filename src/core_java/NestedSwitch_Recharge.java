package core_java;

import java.util.Scanner;

public class NestedSwitch_Recharge
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Select Your Recharge type : \n1.Mobile Recharge\n2.DTH Recharge");
		int recharge = sc.nextInt();
		
		switch (recharge) 
		{
		case 1:
			System.out.println("Enter Your Mobile Operator : \n1.Airtel\n2.JIO");
			int type =sc.nextInt();
			switch (type) 
			{
			case 1:
				System.out.println("Airtel recharge succesful");
				break;
			case 2:
				System.out.println("JIO recharge successful");
				break;
				
			default:
				System.out.println("Invalid Operator for Mobile recharge");
				break;
			}
			break;
		case 2:
			System.out.println("Enter Your DTH Operator : \n1.Tata Play\n2.Dish TV");
			int operators = sc.nextInt();
			switch (operators)
			{
			case 1:
				System.out.println("Tata Play recharge successful");
				break;
			case 2:
				System.out.println("Dish TV recharge successful");
				break;
			default:
				System.out.println("Invalid Operator for DTH Recahrge");
				break;
			}
		default:
			System.out.println("Invalid Recharge");
			break;
		}
		
	}

}
