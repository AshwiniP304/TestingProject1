package core_java;

import java.io.IOException;

import javax.imageio.IIOException;


public class ExceptionHandling_throw_2804
{
	public static void main(String[] args) throws IOException 
	{
		int age = 15;
		if (age<18)
		{
			throw new IIOException("Person below 18 is not eligible for vote");
		}
	}
}
