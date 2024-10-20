package core_java;

import java.util.Scanner;

public class StringDisplayReverse_3103
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String as a Value : ");
		String str = sc.nextLine();
		
		for(int i = str.length()-1;i>-1;i--)
		{
			System.out.print(str.charAt(i));
		}		
	}
}
