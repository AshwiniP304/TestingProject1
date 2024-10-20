package core_java;

import java.util.Scanner;

public class ForLoop_FactorialNo
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		
		//sum= factorial
		
		int sum =1;
		for(int i=1;i<=num;i++)
		{
			sum = sum * i;
		}
		System.out.println("Factorial of "+ num+ " is "+sum);
	}

}
