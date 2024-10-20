package core_java;

import java.util.Scanner;

public class AreaOfTriangle 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Base :");
		int b = sc.nextInt();
		
		System.out.println("Enter Height");
		int h = sc.nextInt();
		
		double a = 0.5 * b * h;
		System.out.println("Area of Triangle : "+a);
		}

}
