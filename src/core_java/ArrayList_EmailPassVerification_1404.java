package core_java;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_EmailPassVerification_1404
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<String> email = new ArrayList<String>();
		ArrayList<String> pass = new ArrayList<String>();
		String retry;
		
		do 
		{
			System.out.println("Enter email address as a database :");
			String em = sc.next();
			email.add(em);
			
			System.out.println("Enter password address as a database :");
			String ps = sc.next();
			pass.add(ps);
			
			System.out.println("If you want to add more data then type 'yes'");
			retry = sc.next();
		} 
		while (retry.equals("yes"));
		
		System.out.println("Enter your email address");
		String em = sc.next();
		System.out.println("Enter your password");
		String ps = sc.next();
		
		for(int i=0;i<email.size();i++)
		{
			if (email.get(i).equals(em)&&pass.get(i).equals(ps)) 
			{
				System.out.println("Login Successfull");
				return;
			}
		}
		System.out.println("Invalid Email ID and Password");
	}
}
