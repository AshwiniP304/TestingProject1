package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementInterface_Display_2306
{
	public static void main(String[] args)
	{
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://rahulshettyacademy.com/AutomationPractice/");
		//boolean display = w.findElement(By.id("displayed-text")).isDisplayed();
		
		//for the hide-->>
		w.findElement(By.id("hide-textbox")).click();
		boolean display = w.findElement(By.id("displayed-text")).isDisplayed();
		
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
