package core_java;

import java.util.Scanner;

public class Array_twoDimension_RowColunm_0704 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of Row : ");
		int row = sc.nextInt();
		
		System.out.println("Enter length of Colunm : ");
		int col = sc.nextInt();
		int arr[][]= new int [row][col];
		System.out.println("Enter value of "+row+ " and "+ col +" respectively :");
		for(int i= 0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		for(int i =0;i<row;i++)
		{
			for(int j = 0;j<col;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
