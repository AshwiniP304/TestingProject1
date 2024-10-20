package selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHandling_Task_GitHub 
{
	public static void main(String[] args) throws Exception, Exception
	{
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://github.com/signup");
		
		
		WebDriverWait wdw = new WebDriverWait(w, Duration.ofSeconds(10));
		//WebDriverWait wdw1 = new WebDriverWait(w, Duration.ofSeconds(15));
		
		WebElement username = wdw.until(ExpectedConditions.elementToBeClickable(By.id("email")));
		username.sendKeys("ashwinip123@gmail.com");
		w.findElement(By.xpath("/html/body/div[1]/div[4]/div[4]/main/div[1]/text-suggester/div[1]/form/div[1]/div[2]/button")).click();
		
		TakesScreenshot tss = (TakesScreenshot) w;
		FileHandler.copy(tss.getScreenshotAs(OutputType.FILE),new File("C:\\Users\\Ashwini patil\\OneDrive\\Documents\\Ashwini\\Screenshot/img001.jpg"));
		
		//wdw1.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[4]/div[4]/main/div[1]/text-suggester/div[1]/form/div[1]/div[2]/button"))).click();
		
		WebElement click = wdw.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[4]/div[4]/main/div[1]/text-suggester/div[1]/form/div[1]/div[2]/button")));
		click.click();
		FileHandler.copy(tss.getScreenshotAs(OutputType.FILE),new File("C:\\Users\\Ashwini patil\\OneDrive\\Documents\\Ashwini\\Screenshot/img002.jpg"));
	}

}
