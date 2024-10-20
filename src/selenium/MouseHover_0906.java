package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover_0906 
{
	public static void main(String[] args) throws Exception
	{
	WebDriver w = new ChromeDriver();
	w.manage().window().maximize();
	w.get("https://www.meesho.com/");
	Actions act = new Actions(w);
	Thread.sleep(2000);
	WebElement hak = w.findElement(By.xpath("/html/body/div/div[2]/div[4]/div/div[9]"));
	Thread.sleep(2000);
	act.moveToElement(hak).perform();
	
	WebElement clock = w.findElement(By.linkText("Clocks"));
	Thread.sleep(2000);
	act.moveToElement(clock).click().perform();

	}

}
