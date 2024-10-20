package oops_concepts;

import java.util.Scanner;

public class Polymorphism_MethodOverloading_0505
{
	public void EmailAndPhoneno(String email)
	{
		System.out.println("Verify through Email ID");
	}
	public void EmailAndPhoneno(int phone)
	{
		System.out.println("Verify through phone no");
	}
	public static void main(String[] args) 
	{
		Polymorphism_MethodOverloading_0505 m = new Polymorphism_MethodOverloading_0505();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your mobile or email address");
		String ep = sc.next();
		
		try 
		{
			int i = Integer.parseInt(ep);
			m.EmailAndPhoneno(i);		
		} 
		catch (Exception e)
		{
			m.EmailAndPhoneno(ep);
		}
	}
}
