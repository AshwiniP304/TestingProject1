package core_java;

import java.util.Scanner;

public class AreaOfSquare 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Side");
		double s = sc.nextDouble();
		
		double a = s * s;
		System.out.println("Area of Square : "+a);
	}

}
