package core_java;

import java.util.Scanner;

public class IfElse_FindAge
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age of Ajay");
		int ajayage = sc.nextInt();
		
		System.out.println("Enter Age of Vijay");
		int vijayage = sc.nextInt();
		
		if (ajayage>vijayage) 
		{
			System.out.println("Ajay is Big Brother");
		}
		else 
		{
			System.out.println("Vijay is Big Brother");
		}
	}

}
