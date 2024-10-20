package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Facebook_1905 
{
	public static void main(String[] args) throws Exception
	{
		WebDriver w = new ChromeDriver();
		Thread.sleep(2000);
		w.manage().window().maximize();
		Thread.sleep(2000);
		w.get("https://www.facebook.com/signup");
		Thread.sleep(2000);
		w.findElement(By.name("reg_email__")).sendKeys("ashpatil304@gmail.com");
		Thread.sleep(2000);
		w.findElement(By.name("firstname")).sendKeys("Ashwini");
		Thread.sleep(2000);
		w.findElement(By.name("lastname")).sendKeys("Patil");
		Thread.sleep(2000);
		w.findElement(By.name("reg_email_confirmation__")).sendKeys("ashpatil304@gmail.com");
		Thread.sleep(2000);
		
	}

}
