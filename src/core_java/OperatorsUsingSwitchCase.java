package core_java;

import java.util.Scanner;

public class OperatorsUsingSwitchCase
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Vlaue of A");
		int num1 = sc.nextInt();
		System.out.println("Enter value of B");
		int num2 = sc.nextInt();
		
		System.out.println("Enter Operator number : \n1.Addition\n2.Subtraction\n3.Division\n4.Multiplication");
		int operator = sc.nextInt();
		
		switch (operator) 
		{
		case 1:
			System.out.println("A + B = "+(num1+num2));
			break;
		case 2:
			System.out.println("A - B : "+(num1-num2));
			break;
		case 3:
			System.out.println("A / B : "+(num1/num2));
			break;
		case 4:
			System.out.println("A * B : "+(num1*num2));
			break;

		default:
			System.out.println("Invalid Operator");
			break;
		}
	}

}
