package core_java;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_FinfSmallestGreatestNum_0704 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of an Array : ");
		int len = sc.nextInt();
		
		int arr[]= new int[len];
		
		System.out.println("Enter value of an Array : ");
		for(int i=0;i< arr.length;i++)
		{
			arr[i]= sc.nextInt();
		}
		Arrays.sort(arr);
		
		System.out.println("Smallest Number in array is "+arr[0]);
		System.err.println("Greatest number in array is "+arr[arr.length-1]);
	}

}
