package oops_concepts;

public class TypesOfMethods_2804
{
//Normal Method
	public void Add()
	{
		int a =10, b = 20;
		System.out.println("a+b = "+(a+b));
	}
	public static void main(String[] args) 
	{
		TypesOfMethods_2804 tm = new TypesOfMethods_2804();
		tm.Add();
		tm.Add();
		System.out.println("a-b = "+tm.sub());
		tm.multi(30,10);
		tm.multi(15,100);
	}

//Return Method	
	public int sub()
	{
		int a = 50, b = 30;
		return a-b;
	}
//Parameterized Method
	private void multi(int a, int b) 
	{
		System.out.println("a*b = "+a*b);
	}
}
