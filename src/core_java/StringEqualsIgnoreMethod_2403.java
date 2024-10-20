package core_java;

import java.util.Scanner;

public class StringEqualsIgnoreMethod_2403 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String as a Value :");
		String str = sc.nextLine();
		
		String str2 = "Hello everyone";
		
		boolean b = str.equalsIgnoreCase(str2);
		System.out.println(b);
	}

}
