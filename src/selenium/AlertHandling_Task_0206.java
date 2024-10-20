package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling_Task_0206
{

	public static void main(String[] args) throws Exception 
	{
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		Thread.sleep(2000);
		w.get("https://rahulshettyacademy.com/AutomationPractice/");
		w.findElement(By.id("confirmbtn")).click();
		Thread.sleep(2000);
		Alert alt = w.switchTo().alert();
		Thread.sleep(2000);
		String info = alt.getText();
		System.out.println(info);
		
		//confirmation alert
		alt.dismiss();
		Thread.sleep(2000);
		w.findElement(By.id("confirmbtn")).click();
		Thread.sleep(2000);
		alt.accept();
		
		Thread.sleep(2000);
		
		w.quit();//close the browser		

	}

}
