package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementInterface_Select_RadioB_2306 
{
	public static void main(String[] args)
	{
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://rahulshettyacademy.com/AutomationPractice/");
		//w.findElement(By.xpath("/html/body/div[1]/div[1]/fieldset/label[1]/input"));  //without click   
		w.findElement(By.xpath("/html/body/div[1]/div[1]/fieldset/label[1]/input")).click();
		boolean select = w.findElement(By.xpath("/html/body/div[1]/div[1]/fieldset/label[1]/input")).isSelected();
		
		if (select) 
		{
			System.out.println("Radio button is selected");
		} 
		else 
		{
			System.out.println("Radio button is not selected");
		}
	}
}
