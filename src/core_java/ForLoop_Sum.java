package core_java;

import java.util.Scanner;

public class ForLoop_Sum 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value : ");
		int num = sc.nextInt();
		
		int sum =0;
		
		for(int i=1;i<=num;i++)
		{
			sum = sum + i;
		}
		System.out.println("Sum of "+num+" is "+sum);
		}

}
