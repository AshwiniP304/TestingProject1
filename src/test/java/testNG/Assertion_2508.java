package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion_2508
{
	WebDriver w;
	
	@Test
	
	public void frontaccounting() throws Exception 
	{
		w = new ChromeDriver();
		w.get("https://demo.frontaccounting.eu/");
		w.findElement(By.name("SubmitUser")).click();
		Thread.sleep(2000);
		Assert.assertEquals(w.getTitle(),"Main Menu");
		
		w.findElement(By.linkText("Logout")).click();
	}
}
