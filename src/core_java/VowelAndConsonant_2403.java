package core_java;

import java.util.Scanner;

public class VowelAndConsonant_2403
{

	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a String as a value :");
	String str = sc.nextLine();
	
	char ch = str.toLowerCase().charAt(0);
	if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') 
	{
		System.out.println("First character of the String is Vowel");
	} 
	else 
	{
		System.out.println("First character of the String is consonant");
	}
	}

}
