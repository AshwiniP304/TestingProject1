package core_java;

import java.util.Scanner;

public class AreaOfRectangle
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Lenght : "); 
		double l = sc.nextDouble();
		
		System.out.println("Enter breadth :");
		double b = sc.nextDouble();
		
		double a = l * b;
		
		System.out.println("Area of Rectangle : "+a);
	}

}
