package core_java;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_EmailVerification_1404 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<String> email = new ArrayList<String>();
		String retry;
		do
		{
			System.out.println("Enter email address as a database :");
			String em = sc.next();
			
			email.add(em);
			
			System.out.println("If you want to add more data then type 'yes'");
			retry = sc.next();
		}
		while (retry.equals("yes"));
		System.out.println(email);
		
		System.out.println("Enter your email address");
		String em = sc.next();
		
		if (email.contains(em))
		{
			System.out.println("Email ID already exist");
		}
		else 
		{
			System.out.println("Email id has to be created");
			email.add(em);
			System.out.println(email);
		}
	}
}
