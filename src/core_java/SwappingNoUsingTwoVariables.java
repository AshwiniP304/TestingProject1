package core_java;

public class SwappingNoUsingTwoVariables 
{

	public static void main(String[] args) 
	{
		int a = 20;
		int b = 10;
		
		System.out.println("Before Swapping :");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		a= a + b; // a=20+10 ==>a=30
		b = a - b; //b=30-20==>b=10
		a = a - b; // a=30-10==>a=20
		
		System.out.println("After Swapping : ");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}

}
