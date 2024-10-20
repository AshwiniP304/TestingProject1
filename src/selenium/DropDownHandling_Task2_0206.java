package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling_Task2_0206
{

	public static void main(String[] args) throws Exception 
	{
	WebDriver w = new ChromeDriver();
	w.manage().window().maximize();
	w.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
	Thread.sleep(2000);
	WebElement country = w.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div[2]/div/div/div/p/select"));
	Select cntry = new Select(country);
	cntry.selectByVisibleText("India");
	Thread.sleep(2000);
	Select cntry1 = new Select(country);
	cntry1.selectByIndex(5);
	Select cntry2 = new Select(country);
	cntry2.selectByValue("HND");
	
	}

}
//when attributes are not available then using XPath