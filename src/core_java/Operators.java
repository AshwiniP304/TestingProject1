package core_java;

public class Operators 

{

	public static void main(String[] args)
	{
		int a =55;
		int b =25;
		
		//BODMAS --> Brackets of Division, Multiplication, Addition, Subtraction
		
		System.out.println(a+b);
		System.out.println("a+b = "+(a+b));
		System.out.println("a-b = "+ (a-b));
		System.out.println("a*b = "+ (a*b));
		System.out.println("a/b = "+ (a/b));
		
		a++;
		System.out.println(a); //OR
		System.out.println("Value of A after increment " + a);
		
		b--;
		System.out.println(b);
		System.out.println("Value of B after decement "+ b);
		
	}

}
