package core_java;

import java.util.Scanner;

public class ArrayDemo3_0704 
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
		for(int i : arr)
		{
			System.out.println(i);
		}
		System.out.println();
		for(int i = arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
		int sum =0;
		
		for(int i : arr)
		{
			sum = sum + i;
		}
		System.out.println("Sum is "+sum);
		
		System.out.println();
		
		//Type Casting for conversion
		
		System.out.println("Avarage is "+(float)+sum/len);
		}

	}


