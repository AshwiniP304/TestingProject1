package core_java;

import java.util.Scanner;

public class SwappingNoUsingTwoVariWithScan 
{

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Value of A");
		int a = sc.nextInt();
		System.out.println("Enter Value of B");
		int b = sc.nextInt();
		System.out.println("Before Swapping");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		a= a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After Swapping");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}

}
