package core_java;

import java.util.Scanner;

public class StringPalimdromUsingReverse_3103
{

	public static void main(String[] args)
	{
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter String Value : ");
		  String str = sc.nextLine();
		  String rev ="";
		  
		  for(int i =str.length()-1;i>-1;i--)
		  {
			  rev = rev + str.charAt(i);
		  }
		  System.out.println(rev);
		  if (str.equals(rev))
		  {
			System.out.println("Given string is Palimdrome");  
	      } 
		 else
		  {
			 System.out.println("Given String is not Palimdrome");
		  }
	}

}
