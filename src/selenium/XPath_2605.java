package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath_2605
{
	public static void main(String[] args) throws Exception 
	{
		WebDriver w = new ChromeDriver();
		Thread.sleep(2000);
		w.get("https://www.saucedemo.com/v1/");
		Thread.sleep(2000);
		
		//True XPath/Absolute Xpath
		w.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/form/input[1]")).sendKeys("true xpath");
		
		//Relavtive XPath
		w.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123");
		
		
		
		
	}

}

// Two Types of XPath--> 1).Absolute Xpath
//2). Relative XPath

//Syntax for create manually Relative XPath--> //*[@Attribute=Value of Attribute]
//("//*[@id=\"password\"]")
//("//*[@____]")