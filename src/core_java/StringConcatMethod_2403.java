package core_java;

import java.util.Scanner;

public class StringConcatMethod_2403 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value of A ;");
		int a = sc.nextInt();
		
		System.out.println("Enter value of B :");
		int b = sc.nextInt();
		
		String cat = " of 2 var ";
		
		System.out.println("Add ".concat(cat)+(a+b));
		System.out.println("Sub ".concat(cat)+(a-b));
		
	//OR
		
		String con = "Multi";
		System.out.println(con.concat(cat)+(a*b));
	}

}
