package core_java;

public class SwappingNumbers
{

	public static void main(String[] args) 
	{
		int a = 20,  b = 10, c;
		
		System.out.println("Before Swapping : ");
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		
		c=a;
		a=b;
		b=c;
		
		System.out.println("After Swapping : ");
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		
		
	}

}
