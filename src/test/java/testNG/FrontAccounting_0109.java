package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FrontAccounting_0109
{
	WebDriver w;
@BeforeClass
public void openBrowser()
{
 w = new ChromeDriver();
}

@BeforeMethod
public void openurl() 
{
	w.get("https://demo.frontaccounting.eu/");
}
@Test(dataProviderClass = DataProvideToFrontAccounting_0109.class, dataProvider = "getdata" )
public void login(String user, String pass) throws Exception 
{
	w.findElement(By.name("user_name_entry_field")).clear();
	Thread.sleep(2000);
	w.findElement(By.name("user_name_entry_field")).sendKeys(user);
	Thread.sleep(2000);
	w.findElement(By.name("password")).clear();
	Thread.sleep(2000);
	w.findElement(By.name("password")).sendKeys(pass);
	Thread.sleep(2000);
	w.findElement(By.name("SubmitUser")).click();
}
@AfterMethod
	public void logout()
	{
	try 
	{
		w.findElement(By.linkText("Logout")).click();
	} catch (Exception e) {
		
	}
	}
}
