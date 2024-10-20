package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_FacebookLogin_2605
{
	public static void main(String[] args) throws Exception
	{
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		Thread.sleep(2000); 
		w.get("https://www.facebook.com/signup");
		Thread.sleep(2000);
		
		//Relative XPath
		w.findElement(By.xpath("//*[@name=\"firstname\"]")).sendKeys("Ashwini");
		Thread.sleep(2000);
		w.findElement(By.xpath("//*[@name=\"lastname\"]")).sendKeys("Patil");
		Thread.sleep(2000);
		w.findElement(By.xpath("//*[@name=\"reg_email__\"]")).sendKeys("ash@mail.com");
		Thread.sleep(2000);
		
		//Absolute XPath
		w.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[4]/div/div[1]/input")).sendKeys("123");
	
		
		//When changing UI then Error is coming in Absolute XPath 
	}
}
