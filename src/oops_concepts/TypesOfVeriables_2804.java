package oops_concepts;

public class TypesOfVeriables_2804 
{
//Normal Method
	private void Add() 
	{
		int a = 10, b = 20;
		System.out.println("a+b = "+(a+b));	
	}
	public static void main(String[] args) 
	{
		TypesOfVeriables_2804 tv = new TypesOfVeriables_2804();
		tv.Add();
		tv.Add();
		System.out.println("a-b = "+tv.sub());
		tv.multi( 10);
		tv.multi( 100);
		System.out.println(tv.a);
		System.out.println(d);
	}
		int a =999; // global of class or instance
		static int d = 150;
//Return Method
	
	public int sub()
	{
	int b =20;//local veriable
	return a-b;
	}
	//Parameterized method
	public void multi(int b)
	{
		System.out.println("a*b = "+a*b);
	}
}


//Static can be call within static or non  static method without creation of new object
//Non static can be call within non static without creation of new object
//but if static in the staatic method then you need to create new object for calling the non static