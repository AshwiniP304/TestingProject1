package core_java;

import java.util.Scanner;

public class StringUpperAndLowerMethod_2403
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of String : ");
		String str = sc.nextLine();
		
		String upper= str.toUpperCase();
		System.out.println("Upper case of given string is " +upper);
		
		String lower = str.toLowerCase();
		System.out.println("Lowe case of given string is "+ lower);
	}
	

}
