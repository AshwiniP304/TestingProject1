package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling_0206
{

	public static void main(String[] args) throws Exception
	{
		WebDriver w = new ChromeDriver();
		w.get("https://www.facebook.com/signup");
		WebElement bday = w.findElement(By.id("day"));
		Select bd = new Select(bday);
		Thread.sleep(2000);
		bd.selectByIndex(4);
		Thread.sleep(2000);
		bd.selectByValue("12");
		Thread.sleep(2000);
		bd.selectByVisibleText("25");
	}

}
