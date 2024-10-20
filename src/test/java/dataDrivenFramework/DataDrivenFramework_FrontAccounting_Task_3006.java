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

public class DataDrivenFramework_FrontAccounting_Task_3006 
{
	public static void main(String[] args) throws Exception
	{
		WebDriver w = new ChromeDriver();
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Ashwini patil\\OneDrive\\Documents\\Ashwini\\Selenium\\FrontAccounting_LoginCredentials.xlsx");
		XSSFWorkbook work = new XSSFWorkbook(fis);
		XSSFSheet sheet = work.getSheet("Sheet1");
		
		for(int i =1;i<=sheet.getLastRowNum();i++)
		{
			XSSFRow row = sheet.getRow(i);
			XSSFCell username = row.getCell(0);
			XSSFCell password = row.getCell(1);
			
		w.manage().window().maximize();
		w.get("https://demo.frontaccounting.eu/");
		w.findElement(By.name("user_name_entry_field")).clear();
		w.findElement(By.name("password")).clear();
		w.findElement(By.name("user_name_entry_field")).sendKeys(username.toString());
		w.findElement(By.name("password")).sendKeys(password.toString());
		w.findElement(By.name("SubmitUser")).click();
		Thread.sleep(2000);
		try
		{
			w.findElement(By.linkText("Logout")).click();
		} 
		catch (Exception e)
		{
			w.navigate().back();
			TakesScreenshot tss = (TakesScreenshot) w;
			FileHandler.copy(tss.getScreenshotAs(OutputType.FILE),new File("C:\\Users\\Ashwini patil\\eclipse-workspace\\AdvancedAutomation\\src\\test\\resources\\"+username.toString()+"  "+password.toString()+".png"));
		}
		}
	}
}
