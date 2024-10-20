package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDriven_TamtamB2b {

	public static void main(String[] args) throws Exception
	{
		WebDriver w = new ChromeDriver();
		FileInputStream fis = new FileInputStream("C:\\Users\\Ashwini patil\\OneDrive\\Documents\\Ashwini\\Selenium\\DataDriven_TamTamB2B.xlsx");
		XSSFWorkbook work = new XSSFWorkbook(fis);
		XSSFSheet sheet = work.getSheet("Sheet1");
		
		for(int i=1;i<=sheet.getLastRowNum();i++)
		{
			XSSFRow row = sheet.getRow(i);
			XSSFCell username = row.getCell(0);
			XSSFCell password = row.getCell(1);
			
			w.manage().window().maximize();
			Thread.sleep(2000);
			w.get("https://b2b.tamtamtours.com/Agentlogin.aspx");
			
			w.findElement(By.id("txtusername")).sendKeys(username.toString());
			Thread.sleep(2000);
			w.findElement(By.id("txtpassword")).sendKeys(password.toString());
			Thread.sleep(2000);
			w.findElement(By.className("loginbtn2")).click();
			Thread.sleep(2000);
			
			try 
			{
				w.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/header/nav/div/ul/li[5]/a/i")).click();
				Thread.sleep(2000);
				w.findElement(By.linkText("Sign out")).click();
			} 
			catch (Exception e)
			{
				// TODO: handle exception
			}	
		}
	}
}
