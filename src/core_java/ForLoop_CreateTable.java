package core_java;

import java.util.Scanner;

public class ForLoop_CreateTable {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value");
		int t = sc.nextInt();
		
		for(int i =1;i<=10;i++)
		{
			System.out.println(t+"*"+i+"="+t*i);
		}
	}

}
