package testNG;

import org.testng.annotations.DataProvider;

public class DataProvideToFrontAccounting_0109 
{
	@DataProvider
	public Object getdata()
	{
		Object data[][] = new Object[4][2];
		data[0][0] = "demouser";
		data[0][1] = "password";
		
		data[1][0] = "demouser123";
		data[1][1] = "password";
		
		data[2][0] = "demouser";
		data[2][1] = "password123";
		
		data[3][0] = "demouser123";
		data[3][1] = "password123";
		return data;
	}	
	
	@DataProvider
	public Object search()
	{
		Object data[] = new Object[4];
		
		data[0] = "Watch";
		data[1] = "smartphone";
		data[2] = "laptop";
		data[3] = "shoes";
		
		return data;
	}
	
	@DataProvider
	public Object logindata()
	{
		Object loginData[][] = new Object[6][2];
		
		loginData[0][0] = "standard_user";
		loginData[0][1] = "secret_sauce";
		
		loginData[1][0] = "locked_out_user";
		loginData[1][1] = "secret_sauce";
		
		loginData[2][0] = "problem_user";
		loginData[2][1] = "secret_sauce";
		
		loginData[3][0] = "performance_glitch_user";
		loginData[3][1] = "secret_sauce";
		
		loginData[4][0] = "error_user";
		loginData[4][1] = "secret_sauce";
		
		loginData[5][0] = "visual_user";
		loginData[5][1] = "secret_sauce";
		
		return loginData;
	}
}
