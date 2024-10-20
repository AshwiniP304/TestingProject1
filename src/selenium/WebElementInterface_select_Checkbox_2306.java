package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementInterface_select_Checkbox_2306 
{
	public static void main(String[] args) 
	{
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://rahulshettyacademy.com/AutomationPractice/");
		w.findElement(By.id("checkBoxOption1")).click();
		boolean select = w.findElement(By.id("checkBoxOption1")).isSelected();
		
		if (select) 
		{
			System.out.println("Web Element is selected");
		} 
		else
		{
			System.out.println("Web Element is not selected");
		}
	}

}
