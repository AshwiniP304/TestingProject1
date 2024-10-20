package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NormalLocator2_2605
{
	public static void main(String[] args) throws Exception
	{
		WebDriver w = new ChromeDriver();
		Thread.sleep(2000);
		w.manage().window().maximize();
		Thread.sleep(2000);
		w.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		//w.findElement(By.linkText("Downloads")).click(); // linkText --> Need 100% same content
	//	Thread.sleep(2000);
		
		w.findElement(By.partialLinkText("Doc")).click();// partialLink --> Similar content
		Thread.sleep(2000);
	}

}



//Types of Normal locators: 1).ID
//2).ClassName
//3).Name
//4).Link
//5).Partial link