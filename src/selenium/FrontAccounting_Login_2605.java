package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrontAccounting_Login_2605
{

	public static void main(String[] args) throws Exception 
	{
		WebDriver w = new ChromeDriver();
		Thread.sleep(2000);
		w.manage().window().maximize();
		w.get("https://demo.frontaccounting.eu/");
		Thread.sleep(2000);
		w.findElement(By.name("user_name_entry_field")).clear();
		Thread.sleep(2000);
		w.findElement(By.name("password")).clear();
		Thread.sleep(2000);
		
		w.findElement(By.name("user_name_entry_field")).sendKeys("demouser");
		Thread.sleep(2000);
		w.findElement(By.name("password")).sendKeys("password");
		Thread.sleep(2000);
		
		w.findElement(By.name("SubmitUser")).click();

	}

}
