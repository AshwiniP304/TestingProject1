package oops_concepts;

class GrandParent
{
	public void qualityofGrandparent()
	{
		System.out.println("This code belong to Grand Parent class");
	}
}
class Parent extends GrandParent
{
	public void qualityofParent()
	{
		System.out.println("This code belong to Parent class");
	}
}
class Child extends Parent
{
	public void qualityofChild()
	{
		System.out.println("This code belong to Child class");
	}
}
public class MultiLevelInheritance_0505
{
	public static void main(String[] args)
	{
		GrandParent gp = new GrandParent();
		gp.qualityofGrandparent();
		System.out.println();
		
		Parent p = new Parent();
		p.qualityofGrandparent();
		p.qualityofParent();
		
		System.out.println();
		
		Child ch = new Child();
		ch.qualityofChild();
		ch.qualityofParent();
		ch.qualityofGrandparent();
	}
}
