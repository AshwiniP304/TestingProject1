package core_java;

import java.util.Scanner;

public class NumberOfVowelAndConsonant_3103
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String Value : ");
		String str = sc.nextLine();
		int v = 0, c= 0; 
		
		for(int i =0; i<str.length();i++)
		{
			char ch= str.toLowerCase().charAt(i);
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				v++;
			}
			else
			{
				c++;
			}
		}
		System.out.println("Number of Vowel in the String is "+v);
		System.out.println("Number of Consonant in the String is "+c);
		
		
	}

}
