																							package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling_Amazon_1606 
{
	public static void main(String[] args) throws Exception
	{
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://www.amazon.in/");
		w.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone 15 pro max");
		w.findElement(By.id("nav-search-submit-button")).click();
		w.findElement(By.partialLinkText("Apple iPhone 15 Pro (1 TB) - Black Titanium")).click();
		
		String parentwindow = w.getWindowHandle();
		System.out.println("Parent window "+ parentwindow);
		Set<String>multiwindow = w.getWindowHandles();
		System.out.println("Multi Window"+multiwindow);
		
		for (String child : multiwindow)
		{
			if (!parentwindow.equals(child)) 
			{
				w.switchTo().window(child);
				Thread.sleep(2000);
				w.findElement(By.id("buy-now-button")).sendKeys(Keys.ENTER);
			}
		}

	}

}
