package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling_Task1_0206
{
	public static void main(String[] args) throws Exception
	{
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		Thread.sleep(2000);
		w.get("https://www.facebook.com/signup");
		WebElement bday = w.findElement(By.id("day"));
		Select bd = new Select(bday);
		Thread.sleep(2000);
		bd.selectByIndex(0);//Using index
		Thread.sleep(2000);
		WebElement bmonth = w.findElement(By.id("month"));
		Select mnth = new Select(bmonth);
		mnth.selectByValue("5");//using value
		Thread.sleep(2000);
		WebElement byear = w.findElement(By.id("year"));
		Select yr = new Select(byear);
		yr.selectByVisibleText("1995");//Using visible text
	}

}
