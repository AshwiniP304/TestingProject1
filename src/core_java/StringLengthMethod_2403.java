package core_java;

import java.util.Scanner;

public class StringLengthMethod_2403
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of String : ");
		String str = sc.nextLine();
		
		System.out.println("Length of the String is "+str.length());
		
		//OR
		
		int len = str.length();
		System.out.println();
		System.out.println("Length of the String is "+len);
	}

}
