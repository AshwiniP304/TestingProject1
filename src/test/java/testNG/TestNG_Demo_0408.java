package testNG;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class TestNG_Demo_0408 
{
	
	//@Test (priority = 1,enabled = false)-->> priority to set the order and enabled = false to not run the case
	@Test 
	
	public void google()
	{
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://www.google.com/");
		w.findElement(By.id("APjFqb")).sendKeys("Laptop",Keys.ENTER);
	}
	
	//@Test (priority = 2)
	@Test
	public void facebook() throws Exception
	{
		WebDriver w = new FirefoxDriver();
		w.manage().window().maximize();
		w.get("https://www.facebook.com");
		w.findElement(By.id("email")).sendKeys("ash@mail.com");
		
		TakesScreenshot tss = (TakesScreenshot) w;
		FileHandler.copy(tss.getScreenshotAs(OutputType.FILE), new File("C:\\Users\\Ashwini patil\\eclipse-workspace\\AdvancedAutomation\\src\\test\\resources\\src.png"));
	}	
}
