package logger4jDemo;

import org.apache.logging.log4j.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowsingWithLog4j_2909
{
		
		Logger log;
		WebDriver w;
		
		@BeforeClass
		public void logger()
		{
			log = LogManager.getFormatterLogger();
		}
		
		@Parameters("browser")  //It is nothing but n Annotation which pass the value from testing.xml parameter value to an method also it help to identify 
		//where to pass that parameter xml value
		
		@BeforeMethod
		public void OpenBrowser(String browser)
		{
			if (browser.equals("chrome"))
			{
				w = new ChromeDriver();
				log.info("Chrome browser has been launched");
			}
			else if (browser.equals("firefox")) 
			{
				w = new FirefoxDriver();
				log.info("Firefox browser has been launched");
			}
			w.get("https://demo.frontaccounting.eu/");
			log.info("Browser has been redirected to Front Accounting site");
		}
		@Test
		public void login()
		{
			w.findElement(By.name("SubmitUser")).click();
			log.info("Click on Login button");
		}
		@AfterMethod
		public void logout()
		{
			w.findElement(By.linkText("Logout")).click();
			log.info("Click on Logout button");
		}
	}


