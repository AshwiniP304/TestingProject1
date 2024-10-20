package core_java;

public class WrapperClassDemo_1404
{
	public static void main(String[] args)
	{
		long b = Long.MIN_VALUE;
		System.out.println(b);
		
		String str = "378945";
		int i = Integer.parseInt(str);
		System.out.println(i);
		
		String str2 = "true";
		boolean b1 = Boolean.parseBoolean(str2);
		System.out.println(b1);
		
		char c = Character.MAX_VALUE;
		System.out.println(c);
	}
}