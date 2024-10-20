package oops_concepts;

class Parent1
{
	public void qualityofParent1()
	{
		System.out.println("This code belong to parent1 class");
	}
}

class Child1 extends Parent1
{
	public void qualityofChild1()
	{
		System.out.println("This code belong to Child1 class");
	}
}
class Child2 extends Parent1
{
	public void qualityofChild2()
	{
		System.out.println("This code belong to Child2 class");
	}
}
class Child3 extends Parent1
{
	public void qualityofChild3()
	{
		System.out.println("This code belong to Child3 class");
	}
}
public class HierarchicalInheritance_0505 
{

	public static void main(String[] args)
	{
		Child1 ch1 = new Child1();
		ch1.qualityofChild1();
		ch1.qualityofParent1();
		
		System.out.println();
		
		Child2 ch2 = new Child2();
		ch2.qualityofChild2();
		ch2.qualityofParent1();
		
		System.out.println();
		
		Child3 ch3 = new Child3();
		ch3.qualityofChild3();
		ch3.qualityofParent1();
	}
}
