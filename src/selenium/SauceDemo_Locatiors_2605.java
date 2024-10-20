package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemo_Locatiors_2605 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriver w = new ChromeDriver();
		Thread.sleep(2000);
		w.manage().window().maximize();
		Thread.sleep(2000);
		w.get("https://www.saucedemo.com/v1/");
		Thread.sleep(2000);
		
		//ID locator
		
		w.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		
		//Customized locator-->1).TagName#ID value
		w.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		
		//ID locator
		w.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		
		//3).TagName[Attribute=Value of that Attribute]
		w.findElement(By.cssSelector("button[style=\"position: absolute; left: 0px; top: 0px; width: 100%; height: 100%; margin: 0px; padding: 0px; border: none; opacity: 0; font-size: 8px; cursor: pointer;\"]")).click();
		Thread.sleep(2000);
		
		//ID locator
		w.findElement(By.id("logout_sidebar_link")).click();
	}
}

//Saucedemo url == https://www.saucedemo.com/v1/




