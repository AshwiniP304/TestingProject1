package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownWithDivTagHandling_2306
{

	public static void main(String[] args) throws Exception 
	{
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		w.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		w.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		w.findElement(By.name("username")).sendKeys("Admin");
		w.findElement(By.name("password")).sendKeys("admin123");
		w.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		w.findElement(By.linkText("PIM")).click();
		
		w.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[6]/div/div[2]/div/div[1]/div[2]/i")).click();
		Thread.sleep(2000);
		
		//Job Titles
		
		List<WebElement> Jobtitles=   w.findElements(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[6]/div/div[2]/div/div[2]/div"));
		for (WebElement Title : Jobtitles)
		{
			if (Title.getText().equals("Automaton Tester"))
			{
				Title.click();
				break;
			}
		}
		
		//Employment status
		
		w.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div[1]/div[2]/i")).click();
		Thread.sleep(2000);
		
		List<WebElement> EmpStatus=  w.findElements(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div[2]/div"));
		for (WebElement sts : EmpStatus) 
		{
			if (sts.getText().equals("Full-Time Permanent"))
			{
				sts.click();
				break;
			}
		}
		
		//Include
		
		w.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div[1]/div[2]/i")).click();
		Thread.sleep(2000);
		
	    List<WebElement> Include =	w.findElements(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div[2]/div"));
		for (WebElement in : Include)
		{
			if (in.getText().equals("Current Employees Only"))
			{
				in.click();
				break;
			}
		}
	
		//Sub Units
		
		w.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[7]/div/div[2]/div/div[1]/div[2]/i")).click();
		Thread.sleep(2000);
		
		List<WebElement> SubUnit =   w.findElements(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[7]/div/div[2]/div/div[2]/div"));
		for (WebElement units : SubUnit)
		{
			if (units.getText().equals("Quality Assurance")) 
			{
				units.click();
				break;
			}
		}
	}
}
