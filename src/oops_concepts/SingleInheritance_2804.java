package oops_concepts;
class SuperClass
{
	public void demo() 
	{
		System.out.println("This is am demo method for superclass");
	}
	public void common()
	{
		System.out.println("This is an common method of child class");
	}
	int a = 10;
}
class SubClass extends SuperClass
{
	public void uncommon()
	{
		System.out.println("This is an uncommon method of child class");
	}
}
public class SingleInheritance_2804 
{
	public static void main(String[] args)
	{
		SubClass s = new SubClass();
		s.demo();
		s.uncommon();
		s.common();
		System.out.println(s.a);
		SuperClass sc = new SuperClass();
		sc.common();

	}

}
