package core_java;

import java.util.Scanner;

public class WhileLoop_Game 
{

	public static void main(String[] args)
	{
		int attempt = 3;
		int maxattempt = 0;
		boolean b = true;
		while (true) 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Choose Your Action : 'Attack','Defend','Escape'");
			String action = sc.next();
			switch (action) 
			{
			case "Attack":
				b= true;
				break;
			case "Defend":
				b= true;
				break;
			case "Escape":
				b= true;
				break;

			default:
				b= false;
				break;
			}
			if (b) 
			{
				System.out.println("Action "+action+" has been perform");
			}
			else 
			{
				System.out.println("Invalid Action");
				attempt--;
				System.out.println(attempt+" Attempt has been left");
				if (attempt==maxattempt) 
				{
					System.out.println("Game Over");
					break;
				}
			}
		}
	}

}
