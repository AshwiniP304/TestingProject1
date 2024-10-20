package keyDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flipkart_KDF_2807 {

	public static void main(String[] args) throws Exception
	{
		WebDriver w = new FirefoxDriver();
		FileInputStream fis = new FileInputStream("C:\\Users\\Ashwini patil\\OneDrive\\Documents\\Ashwini\\Selenium\\Flipkart_KDF.xlsx");
		XSSFWorkbook work = new XSSFWorkbook(fis);
		XSSFSheet sheet = work.getSheet("Sheet1");
		for(int i=0;i<=sheet.getLastRowNum();i++)
		{
			XSSFRow row = sheet.getRow(i);
			XSSFCell TestStep = row.getCell(0);
			RepoFlipkart_Task_2807 rft = new RepoFlipkart_Task_2807(w);
			switch (TestStep.toString()) 
			{
			case "openUrl":
				rft.openUrl("https://www.flipkart.com/");
				break;
			//case"p1"
			//	frt.search
			case "productone":
				rft.addProduct1();
				break;
			case "producttwo":
				rft.addProduct2();
				break;
			case "cart":
				rft.opencart();
				break;
				default:
				System.out.println("Defect");
				break;
			}
		}
	}

}
