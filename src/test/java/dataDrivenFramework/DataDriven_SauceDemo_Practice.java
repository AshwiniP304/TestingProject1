package dataDrivenFramework;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDriven_SauceDemo_Practice 
{
	public static void main(String[] args) throws Exception 
	{
		WebDriver w  = new ChromeDriver();
		FileInputStream fis = new FileInputStream("C:\\Users\\Ashwini patil\\OneDrive\\Documents\\Ashwini\\Selenium\\DataDriven_SauceDemo_Practice.xlsx");
		XSSFWorkbook work = new XSSFWorkbook(fis);
		XSSFSheet sheet = work.getSheet("Sheet1");
		
		for(int i =1;i<=sheet.getLastRowNum();i++)
		{
			XSSFRow row = sheet.getRow(i);
			XSSFCell username = row.getCell(0);
			XSSFCell password = row.getCell(1);
		
		w.manage().window().maximize();
		Thread.sleep(2000);
		w.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		w.findElement(By.id("user-name")).sendKeys(username.toString());
		Thread.sleep(2000);
		w.findElement(By.id("password")).sendKeys(password.toString());
		Thread.sleep(2000);
		w.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		
		try 
		{
			w.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
			Thread.sleep(2000);
			w.findElement(By.className("shopping_cart_badge")).click();
			Thread.sleep(2000);
			w.findElement(By.id("checkout")).click();
			Thread.sleep(2000);
			w.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();
			Thread.sleep(2000);
			w.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		} 
		catch (Exception e) 
		{
			
		}
	}
}
}
