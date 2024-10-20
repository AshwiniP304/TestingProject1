package logger4jDemo;

import org.apache.logging.log4j.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrontAccounting_Log4j_2909
{
	public static void main(String[] args)
	{
		Logger log = LogManager.getFormatterLogger();
		
		try
		{
			WebDriver w = new ChromeDriver();
			String user = "demouser";
			String pass = "password";
			
			log.info("Browser has been launched");
			w.get("https://demo.frontaccounting.eu/");
			log.info("Browser has been redireted to Front Accounting site.");
			
			w.findElement(By.name("user_name_entry_field")).clear();
			log.info(user + " value field has been cleared");
			w.findElement(By.name("user_name_entry_field")).sendKeys(user);
			log.info(user + " value has been added in username field ");
			
			w.findElement(By.name("password")).clear();
			log.info(pass + "value field has been cleared");
			w.findElement(By.name("password")).sendKeys(pass);
			log.info(user + " value has been added in password field ");
			
			w.findElement(By.name("SubmitUser")).click();
			log.info("User click on Login button.");
			
			w.findElement(By.linkText("Logout")).click();
			log.info("User click on Logout button.");	
		} 
		catch (Exception e)
		{
			log.error("User unable to login");
		}
	}
}
