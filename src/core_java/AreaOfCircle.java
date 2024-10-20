package core_java;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius");
		int r = sc.nextInt();
		
		double a = 3.14 * r * r;
		
		System.out.println("Area of Circle : "+a);
	}

}
