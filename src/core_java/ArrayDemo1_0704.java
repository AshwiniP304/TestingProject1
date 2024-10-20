package core_java;

public class ArrayDemo1_0704 
{

	public static void main(String[] args) 
	{
		int arr[] = {10,20,30,40,50,60,70,80};
		
		System.out.println(arr[1]);
		System.out.println(arr.length-1);
		
		//For Loop
		
		for(int i = 0; i< arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println();
		for(int i = arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
		
		//For Each
		
		System.out.println();
		System.out.println("For Each : ");
		for(int i : arr)
		{
			System.out.println(i);
		}
	}

}
