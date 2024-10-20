package core_java;

import java.util.Scanner;

public class StringEqualMethod_2403 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String as a Value");
		String str = sc.nextLine();
		
		String str2 = "Hello Everyone";
		
		boolean b = str.equals(str2);
		//System.out.println(b);
		
		if(b)
		{
			System.out.println("Match has been Found");
		}
		else
		{
			System.out.println("Match has not been found");
		}
		
	}

}
