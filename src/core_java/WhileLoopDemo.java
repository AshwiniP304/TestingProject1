package core_java;

public class WhileLoopDemo 
{

	public static void main(String[] args)
	{
	//Increment
		int i = 1;
		while(i < 6)
		{
			System.out.println(i);
			i++;
		}
		System.out.println();
		System.out.println(i);
		
	//Decrement
		int j = 6;
		while (j>=1) 
		{
			System.out.println(j);
			j--;
		}
		System.out.println();
		System.out.println(j);
		
	//Infinite Loop	
		
		while (true) 
		{
			System.out.println("Hello");
			break;
		}
		System.out.println("Hello Everyone");
	}

}
