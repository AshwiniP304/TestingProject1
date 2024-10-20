package core_java;

import java.util.Scanner;

public class Scanner1 
{

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of A");
		int a = sc.nextInt();
		System.out.println("Enter value of B");
		int b = sc.nextInt();
		
		//BODMAS --> Brackets of Division, Multiplication, Addition, Subtraction
		
		System.out.println(a+b);
		System.out.println("a+b = "+(a+b));
		System.out.println("a-b = "+ (a-b));
		System.out.println("a*b = "+ (a*b));
		System.out.println("a/b = "+ (a/b));
		
		a++;
		System.out.println(a); //OR
		System.out.println("Value of A after increment " + a);
		
		b--;
		System.out.println(b);
		System.out.println("Value of B after decement "+ b);
		
	}



	}


