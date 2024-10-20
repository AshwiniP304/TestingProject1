package core_java;

import java.util.Scanner;

public class StringCharAtMethod_2403 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of String : ");
		String str = sc.nextLine();
		
		char first = str.charAt(0);
		
		System.out.println("First character of the String is "+ first);
		int len = str.length();
		
		char last = str.charAt(len-1);
		System.out.println("Last character of the String is "+last);
		
	}

}
