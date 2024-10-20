package keyDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.formula.atp.Switch;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SauceDemo_KDF_2107 
{
	public static void main(String[] args) throws Exception
	{
		WebDriver w = new ChromeDriver();
		FileInputStream fis = new FileInputStream("C:\\Users\\Ashwini patil\\OneDrive\\Documents\\Ashwini\\Selenium\\SauceDemoKDF.xlsx");
		XSSFWorkbook work = new XSSFWorkbook(fis);
		XSSFSheet sheet = work.getSheet("Sheet1");
		for(int i =1;i<=sheet.getLastRowNum();i++)
		{
			XSSFRow row = sheet.getRow(i);
			XSSFCell TestStep = row.getCell(0);
			RepoSauceDemo_2107 rsd = new RepoSauceDemo_2107(w);
			switch (TestStep.toString()) 
			{
			case "openUrl":
				rsd.openUrl("https://www.saucedemo.com/v1/index.html");
				break;
			case "login":
				rsd.login("standard_user", "secret_sauce");
				break;
			case "productone":
				rsd.addProduct1();
				break;
			case "producttwo":
				rsd.addProduct2();
				break;
			case "cart":
				rsd.opencart();
				break;
			case "checkout":
				rsd.checkout();
				break;
			case "yourinfo":
				rsd.yourInfo("Ashwini", "Patil", "400605");
				break;	
			case "overview":
				rsd.overview();
				break;
			case "logout":
				rsd.logout();
				break;		
			default:
				System.out.println("Defect");
				break;
			}
		}
	}
}
