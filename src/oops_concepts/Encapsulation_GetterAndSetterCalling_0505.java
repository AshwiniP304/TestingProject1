package oops_concepts;

public class Encapsulation_GetterAndSetterCalling_0505 
{
	public static void main(String[] args)
	{
		Encapsulation_GetterAndSetter_0505 gs = new Encapsulation_GetterAndSetter_0505();
		System.out.println("Password before change "+gs.getPassword());
		gs.setPassword(1234);
		System.out.println("Password after change "+gs.getPassword());
	}
}
