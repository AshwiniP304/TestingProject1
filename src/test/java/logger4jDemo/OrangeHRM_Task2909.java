package logger4jDemo;

import java.time.Duration;

import org.apache.logging.log4j.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OrangeHRM_Task2909
{

	public static void main(String[] args) 
	{
		Logger log = LogManager.getFormatterLogger();
		
		try 
		{
			WebDriver w = new ChromeDriver();
			String user = "Admin";
			String pass = "admin123";
			
			log.info("Browser has been launched");
			w.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			log.info("Browser has been redireted to Demo OrangeHRM.");
			w.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			w.findElement(By.name("username")).sendKeys(user);
			log.info(user + " value has been added in username field ");
			
			w.findElement(By.name("password")).sendKeys(pass);
			log.info(user + " value has been added in password field ");
			
			w.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
			log.info("User click on Login button.");
			
			
			w.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/i")).click();
			w.findElement(By.linkText("Logout")).click();
			log.info("User click on Logout button.");
		}
		catch (Exception e) 
		{
			log.error("User unable to login");
		}
	}
}
