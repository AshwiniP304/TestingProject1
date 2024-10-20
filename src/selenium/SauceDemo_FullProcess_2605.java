package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemo_FullProcess_2605 
{

	public static void main(String[] args) throws Exception
	{
		WebDriver w = new ChromeDriver();
		Thread.sleep(2000);
		w.manage().window().maximize();
		Thread.sleep(2000);
		w.get("https://www.saucedemo.com/v1/");
		Thread.sleep(2000);
		w.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		w.findElement(By.name("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		w.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		w.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/div/div[3]/div[3]/button")).click();
		Thread.sleep(2000);
		w.findElement(By.className("fa-layers-counter")).click();
		Thread.sleep(2000);
		w.findElement(By.linkText("CHECKOUT")).click();
		Thread.sleep(2000);
		w.findElement(By.cssSelector("input#first-name")).sendKeys("Ashwini");
		Thread.sleep(2000);
		w.findElement(By.cssSelector("input#last-name")).sendKeys("Patil");
		Thread.sleep(2000);
		w.findElement(By.cssSelector("input#postal-code")).sendKeys("400605");
		Thread.sleep(2000);
		w.findElement(By.className("btn_primary")).click();
		Thread.sleep(2000);
		w.findElement(By.linkText("FINISH")).click();
		Thread.sleep(2000);
		
		
	}

}
