package hybridDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.commons.math3.ode.FirstOrderConverter;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import keyDrivenFramework.RepoSauceDemo_2107;

public class SauceDemo_HDF_2807 
{
	public static void main(String[] args) throws Exception 
	{
		WebDriver w = new ChromeDriver();
		FileInputStream fis = new FileInputStream("C:\\Users\\Ashwini patil\\OneDrive\\Documents\\Ashwini\\Selenium\\SauceDemo_HDF.xlsx");
		XSSFWorkbook work = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = work.getSheet("Sheet1");
		XSSFSheet sheet2 = work.getSheet("Sheet2");
		for(int i=1;i<=sheet1.getLastRowNum();i++)
		{
			XSSFRow row = sheet1.getRow(i);
			XSSFCell username = row.getCell(0);
			
			XSSFCell password = row.getCell(1);
			XSSFCell firstname = row.getCell(2);
			XSSFCell lastname = row.getCell(3);
			XSSFCell zipcode = row.getCell(4);
			DataFormatter dataf= new DataFormatter();
			String pincode = dataf.formatCellValue(zipcode);
			String first = dataf.formatCellValue(firstname);
			String last = dataf.formatCellValue(lastname);
			
			
			for(int j =1;j<=sheet2.getLastRowNum();j++)
			{
				XSSFRow row1 = sheet2.getRow(j);
				XSSFCell TestStep = row1.getCell(0);
				System.out.println(TestStep.toString());
				RepoSauceDemo_2807 rsd = new RepoSauceDemo_2807(w);
				switch (TestStep.toString()) 
				{
				case "openUrl":
					rsd.openUrl("https://www.saucedemo.com/v1/index.html");
					break;
				case "login":
					rsd.login(username.toString(),password.toString());
					break;
				case "productone":
					try 
					{
						rsd.addProduct1();
						break;
					} 
					catch (Exception e) 
					{	
					}
				case "producttwo":
					try {
						rsd.addProduct2();
						break;
					} 
					catch (Exception e)
					{
					}
				case "cart":
					try
					{
						rsd.opencart();
						break;
					}
					catch (Exception e) 
					{
					}
				case "checkout":
					try 
					{
						rsd.checkout();
						break;
					} catch (Exception e)
					{
					}
					
				case "yourinfo":
					try 
					{
						rsd.yourInfo(first.toString(), last.toString(),pincode);
						break;
					}
					catch (Exception e) 
					{
					}	
				case "overview":
					try 
					{
						rsd.overview();
						break;
					} catch (Exception e)
					{
					}	
				case "logout":
					try 
					{
						rsd.logout();
						break;
					} catch (Exception e)
					{	
					}		
				default:
					System.out.println("Defect");
					break;
				}
		}	
	}
	}
}
