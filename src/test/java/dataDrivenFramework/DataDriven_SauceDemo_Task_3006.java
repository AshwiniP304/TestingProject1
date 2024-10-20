package dataDrivenFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class DataDriven_SauceDemo_Task_3006 
{
	public static void main(String[] args) throws Exception 
	{
		WebDriver w = new ChromeDriver();
		FileInputStream fis = new FileInputStream("C:\\Users\\Ashwini patil\\OneDrive\\Documents\\Ashwini\\Selenium\\DataDriven_SauceDemo.xlsx");
		XSSFWorkbook work = new XSSFWorkbook(fis);
		XSSFSheet sheet = work.getSheet("Sheet1");
		
		for(int i=1;i<=sheet.getLastRowNum();i++)
		{
			XSSFRow row = sheet.getRow(i);
			XSSFCell username1 = row.getCell(0);
			XSSFCell password1 = row.getCell(1);
			
			w.manage().window().maximize();
			Thread.sleep(2000);
			w.get("https://www.saucedemo.com/v1/");
			Thread.sleep(2000);
			w.findElement(By.id("user-name")).sendKeys(username1.toString());
			Thread.sleep(2000);
			w.findElement(By.id("password")).sendKeys(password1.toString());
			Thread.sleep(2000);
			w.findElement(By.id("login-button")).click();
			Thread.sleep(2000);
			try 
			{
				w.findElement(By.linkText("Sauce Labs Bolt T-Shirt")).click();
				Thread.sleep(2000);
				w.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div/div/button")).click();
				Thread.sleep(2000);
				w.findElement(By.className("fa-layers-counter")).click();
				Thread.sleep(2000);
				w.findElement(By.xpath("/html/body/div/div[1]/div/div[3]/div/button")).click();
				Thread.sleep(2000);
				w.findElement(By.linkText("Logout")).click();
			} 
			catch (Exception e) 
			{	
			//	w.navigate().back();
				TakesScreenshot tss = (TakesScreenshot) w;
				FileHandler.copy(tss.getScreenshotAs(OutputType.FILE),new File("C:\\Users\\Ashwini patil\\OneDrive\\Documents\\Ashwini\\Screenshot\\userpass"+i+".jpg"));
			}		
		}
	}
}
