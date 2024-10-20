package core_java;

import java.util.Scanner;

public class CirumferenceOfCircle
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius : ");
		int r = sc.nextInt();
		
		double a = 2 * 3.14 * r;
		
		System.out.println("Circumference of Circle : "+a);
	}

}
