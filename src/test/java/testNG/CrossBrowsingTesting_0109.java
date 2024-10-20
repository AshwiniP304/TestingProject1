package testNG;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class CrossBrowsingTesting_0109
{
		WebDriver w;
	
		@Parameters("browser")  //It is nothing but n Annotation which pass the value from testing.xml parameter value to an method also it help to identify 
		//where to pass that parameter xml value
		
		@BeforeMethod
		public void OpenBrowser(String browser)
		{
			if (browser.equals("chrome"))
			{
				w = new ChromeDriver();
			}
			else if (browser.equals("firefox")) 
			{
				w = new FirefoxDriver();
			}
			w.get("https://demo.frontaccounting.eu/");
		}
		@Test
		public void login()
		{
			w.findElement(By.name("SubmitUser")).click();
		}
		@AfterMethod
		public void logout()
		{
			w.findElement(By.linkText("Logout")).click();
		}
}
