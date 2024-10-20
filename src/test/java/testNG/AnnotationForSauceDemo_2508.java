package testNG;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationForSauceDemo_2508
{
//Before method & after method it can execute every time when your condition is present 	
	WebDriver w;
	
	@BeforeClass
	public void OpenBrowser() 
	{
		w = new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://www.saucedemo.com/");
	}
	
	@BeforeMethod // Pre-condition before method execute before condition start there execution
	public void login() throws Exception
	{
		w.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		w.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		w.findElement(By.id("login-button")).click();
	}
	
	@Test //Condition
	
	public void Product1() throws Exception 
	{
		Thread.sleep(2000);
		w.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(2000);
	}
	
	@Test
	public void Product2() throws Exception
	{
		Thread.sleep(2000);
		w.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		Thread.sleep(2000);
	}
	
	@AfterMethod  // After one condition execution is done it start to executed himself
	
	public void logout() throws Exception {
		w.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(2000);
		w.findElement(By.partialLinkText("Logout")).click();		
	}
	
	@AfterClass
	public void closeBrowser() throws Exception
	{
		Thread.sleep(2000);
		w.close();
	}	
}
