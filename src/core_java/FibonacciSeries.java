package core_java;

import java.util.Scanner;

public class FibonacciSeries
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value how much should be shown in fibonacci :");
		int num = sc.nextInt();
		int n1=0,n2=1;
		
		int sum = 0;
		System.out.println("Showing Fibonacci series value :");
		while (n1<num)
		{
			System.out.print(n1+",");
			sum= n1+n2;
			n1=n2;
			n2=sum;
		}

	}

}
