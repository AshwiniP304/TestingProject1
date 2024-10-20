package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons_Checkbox_1606 
{
	public static void main(String[] args) throws Exception 
	{
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://rahulshettyacademy.com/AutomationPractice/");
		//findElement--> Single element
		//w.findElement(By.id("checkBoxOption1")).click();
		
		//findElements--> Multiple elements
		
		//Checkbox
		List<WebElement> checkbox = w.findElements(By.xpath("/html/body/div[1]/div[4]/fieldset/label/input"));
		//OR
		//List<WebElement> checkbox = w.findElements(By.cssSelector("input[type=\"checkbox\"]"));
		
		for (WebElement ch : checkbox)
		{
			ch.click();
			Thread.sleep(2000);	
		}
		
		//Radio Button
		List<WebElement> radiobutton =  w.findElements(By.xpath("/html/body/div[1]/div[1]/fieldset/label/input"));
		Thread.sleep(2000);
		for (WebElement ch : radiobutton)
		{
			ch.click();
			Thread.sleep(2000);	
		}	
	}
}
