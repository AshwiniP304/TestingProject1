package core_java;

import java.util.Scanner;

public class ForLoop_FindPrimeNumber 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = sc.nextInt();
		
		if (num!=1)
		{
			if (num!=0)
			{
				boolean b = true;
				for (int i =2;i<num;i++)
				{
					if (num%i==0)
					{
						b= false;
					}
				}
				if (b) 
				{
					System.out.println(num+" is a prime number");
				}
				else 
				{
					System.out.println(num+ " is not a Prime Number");
				}
		    }
			else 
			{
				System.out.println(num+" is not a prime or prime number");
			}
		}
		else {
			System.out.println(num+" is not Prime number");
		}
	}
}

