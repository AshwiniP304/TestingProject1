package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertHandling_0206 
{
	public static void main(String[] args) throws Exception 
	{
		WebDriver w =  new FirefoxDriver();
		w.manage().window().maximize();
		Thread.sleep(2000);
		w.get("https://rahulshettyacademy.com/AutomationPractice/");
		w.findElement(By.id("alertbtn")).click();
		Thread.sleep(2000);
		
		//Simple alert
		Alert alt = w.switchTo().alert();
		Thread.sleep(2000);
		String info = alt.getText();
		System.out.println(info);
		
		alt.accept();//click on OK button in alert
	}

}
