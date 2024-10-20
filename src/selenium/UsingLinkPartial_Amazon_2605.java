package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingLinkPartial_Amazon_2605
{
	public static void main(String[] args) throws Exception 
	{
		WebDriver w = new ChromeDriver();
		Thread.sleep(2000);
		w.manage().window().maximize();
		Thread.sleep(2000);
		w.get("https://www.amazon.in/");
		Thread.sleep(2000);
		w.findElement(By.linkText("Amazon miniTV")).click();
		Thread.sleep(2000);
		w.findElement(By.partialLinkText("Web")).click();
	}

}
