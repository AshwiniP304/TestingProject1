package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling_Flipkart_1606 
{
	public static void main(String[] args) throws Exception 
	{
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://www.flipkart.com/");
		w.findElement(By.name("q")).sendKeys("Watch for Women");
		w.findElement(By.name("q")).submit();
		Thread.sleep(2000);
		w.findElement(By.xpath("/html/body/div/div/div[3]/div[1]/div[2]/div[2]/div/div[3]/div/a/div[1]/div/div/div/img")).click();
		
		String parentwindow = w.getWindowHandle();
		System.out.println("Parent window "+ parentwindow);
		Set<String> multiwindow =w.getWindowHandles();
		System.out.println("Multi Window"+multiwindow);
		
		for(String child: multiwindow)
		{
			if (!parentwindow.equals(child)) 
			{
				w.switchTo().window(child);
				Thread.sleep(2000);
				w.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[2]/form/button")).click();
			}
		}
	}
}
