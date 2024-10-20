package core_java;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap_CustomerIDAndPaas_2104
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, String> Clogin = new HashMap<Integer, String>();
		String retry;
		do 
		{
			System.out.println("Enter your Customer ID as a databse :");
			int id = sc.nextInt();
			System.out.println("Enter your password as a database :");
			String pass = sc.next();
			Clogin.put(id, pass);
			System.out.println("If you want to return then type 'yes' ");
			retry=sc.next();
		} 
		while (retry.equals("yes"));
		System.out.println("Enter your Customer ID :");
		int id = sc.nextInt();
		System.out.println("Ener your password : ");
		String pass = sc.next();
		if (Clogin.containsKey(id)&&Clogin.get(id).equals(pass))
		{
			System.out.println("Login successful");
		}
		else 
		{
			System.out.println("Invalid customer id or password");
		}
	}
}
