package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task_DropDown_Alert_0206 
{

	public static void main(String[] args) throws Exception
	{
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		Thread.sleep(2000);
		w.get("https://demo.frontaccounting.eu/index.php");
		Thread.sleep(2000);
		w.findElement(By.name("SubmitUser")).click();
		Thread.sleep(2000);
		w.findElement(By.xpath("/html/body/table[1]/tbody/tr/td/table[1]/tbody/tr/td/div[2]/table/tbody/tr[1]/td/table/tbody/tr[2]/td[1]/a[1]")).click();
	
		Thread.sleep(2000);
		WebElement custid = w.findElement(By.id("customer_id"));
		Select custmr = new Select(custid);
		custmr.selectByVisibleText("WWW");
		
		w.findElement(By.id("CancelOrder")).click();
		Thread.sleep(2000);
		Alert alt = w.switchTo().alert();
		Thread.sleep(2000);
		alt.dismiss();// choose Cancel option
		Thread.sleep(2000);
		w.findElement(By.id("CancelOrder")).click();
		Thread.sleep(2000);
		alt.accept();//choose okay option
	}
	
	

}
