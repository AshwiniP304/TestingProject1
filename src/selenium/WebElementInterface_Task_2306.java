package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementInterface_Task_2306
{
	public static void main(String[] args) throws Exception
	{
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		Thread.sleep(2000);
		w.get("https://www.facebook.com/reg/");
		Thread.sleep(2000);
//		w.findElement(By.name("reg_email__")).sendKeys("ash@mail.com");
		Thread.sleep(2000);
		boolean display = w.findElement(By.name("reg_email_confirmation__")).isDisplayed();
		
		if (display)
		{
			System.out.println("Webelement is display on the web page");
		} 
		else 
		{
			System.out.println("Webelement is not display on the web page");
		}
	}

}
