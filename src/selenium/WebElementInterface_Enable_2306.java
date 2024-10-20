package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementInterface_Enable_2306 
{
	public static void main(String[] args) throws Exception
	{
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://github.com/signup");
		Thread.sleep(7000);
		w.findElement(By.id("email")).sendKeys("ash01@mail.com");
		Thread.sleep(2000);
		boolean enable = w.findElement(By.cssSelector("button[data-continue-to=\"password-container\"]")).isEnabled();
		
		if (enable) 
		{
			System.out.println("Continue button is enable");
		} 
		else 
		{
			System.out.println("Continue button is disable");
		}
	}
}
