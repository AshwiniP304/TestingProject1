package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NormalLocator1_1905 
{
	public static void main(String[] args) throws Exception
	{
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		Thread.sleep(2000);
		w.get("https://www.amazon.in/");
		Thread.sleep(2000);
		w.findElement(By.id("twotabsearchtextbox")).sendKeys("watch");
		Thread.sleep(2000);
		w.findElement(By.className("nav-input")).sendKeys(" and shoes");
		Thread.sleep(2000);
		//w.findElement(By.name("field-keywords")).clear();
		
		w.findElement(By.id("nav-search-submit-text")).click();
	}

}



//Types of Normal locators: 1).ID
//2).ClassName
//3).Name
//4).Link
//5).Partial link