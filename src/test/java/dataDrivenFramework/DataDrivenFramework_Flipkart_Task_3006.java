package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DataDrivenFramework_Flipkart_Task_3006 
{
	public static void main(String[] args) throws Exception
	{
		WebDriver w = new FirefoxDriver();
		w.manage().window().maximize();
		w.get("https://www.flipkart.com/");
		FileInputStream fis = new FileInputStream("C:\\Users\\Ashwini patil\\OneDrive\\Documents\\Ashwini\\Selenium\\Flipkart_products_DDF.xlsx");
		XSSFWorkbook work = new XSSFWorkbook(fis);
		XSSFSheet sheet = work.getSheet("Sheet1");
		
		for(int i=1;i<=sheet.getLastRowNum();i++)
		{
			XSSFCell search = sheet.getRow(i).getCell(0);
			Thread.sleep(2000);
			w.findElement(By.name("q")).clear();
			Thread.sleep(2000);
			w.findElement(By.name("q")).sendKeys(search.toString(),Keys.ENTER);
			Thread.sleep(2000);
			if (search.toString().equals("GoPro")) 
			{
				Thread.sleep(2000);
				//w.findElement(By.cssSelector("img[alt=\"GoPro Hero 10 Waterproof with Front LCD and Touch Rear Screens\"]")).click();
				w.findElement(By.xpath("/html/body/div/div/div[3]/div[1]/div[2]/div[2]/div/div[2]/div/a[1]")).click();
			}
			else if (search.toString().equals("IPhone15")) 	
			{
				Thread.sleep(2000);
				w.findElement(By.partialLinkText("Apple iPhone 15 (Black, 128 GB)")).click();
			}
			String parent = w.getWindowHandle();
			Set<String> child = w.getWindowHandles();
			for(String ch : child)
			{
				if (!ch.equals(parent))
				{
					w.switchTo().window(ch);
					Thread.sleep(2000);
					w.findElement(By.cssSelector("button[class=\"QqFHMw vslbG+ In9uk2\"]")).click();
					Thread.sleep(2000);
					if (!search.toString().equals("IPhone15"))
					{
						w.close();
						w.switchTo().window(parent);
					}
				}
			}
		}
	}
}