package oops_concepts;

class vehicle
{
	public void speed() 
	{
		System.out.println("Average speed of vehicle is 45 km/hr");
	}
}
class bike extends vehicle
{
	public void speed()
	{
		System.out.println("Average speed of bike is 60 km/hr");
	}
}
class car extends vehicle
{
	public void speed()
	{
		System.out.println("Average speed of car is 40 km/hr");
	}
}
public class Polymorphism_Overriding_0505
{

	public static void main(String[] args) 
	{
		vehicle v = new vehicle();
		v.speed();
		
		System.out.println();
		
		bike b = new bike();
		b.speed();
		
		System.out.println();
		
		car c = new car();
		c.speed();
	}
}
