package selenium;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class ScreenShot_0206
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
		
		//TakesScreenshot tss = (TakesScreenshot)w;
		//File scr = tss.getScreenshotAs(OutputType.FILE);
		//File des = new File("C:\\Users\\Ashwini patil\\OneDrive\\Documents\\Ashwini\\src1.png");
		//FileHandler.copy(scr, des);
		
		TakesScreenshot tss = (TakesScreenshot) w;
		FileHandler.copy(tss.getScreenshotAs(OutputType.FILE), new File("C:\\Users\\Ashwini patil\\OneDrive\\Documents\\Ashwini\\src2.png"));		
		
		
		Thread.sleep(2000);
		bd.selectByVisibleText("25");
	}
}
