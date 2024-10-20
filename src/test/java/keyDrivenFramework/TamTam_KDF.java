package keyDrivenFramework;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TamTam_KDF 
{

	public static void main(String[] args) throws Exception
	{
		WebDriver w = new ChromeDriver();
		w.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		w.manage().window().maximize();
		FileInputStream fis = new FileInputStream("C:\\Users\\Ashwini patil\\OneDrive\\Documents\\Ashwini\\Selenium\\KDF_TamTam.xlsx");
		XSSFWorkbook work = new XSSFWorkbook(fis);
		XSSFSheet sheet = work.getSheet("Sheet1");
		
		try
		{
			for(int i=1;i<=sheet.getLastRowNum();i++)
			{
				XSSFRow row = sheet.getRow(i);
				XSSFCell TestStep = row.getCell(0);
				RepoTamTamB2B rtt = new RepoTamTamB2B(w);
				switch (TestStep.toString()) 
				{
				case "openUrl":
					rtt.openUrl("https://b2b.tamtamtours.com/Agentlogin.aspx");
					break;
				case "login":
					rtt.login("kiran@tamtamtours.com", "Kiran@tamtam");
					break;
				case "clickHotel":
					rtt.hotel();
				case "selectDestination":
					rtt.dropdownOnDestination("71");
				case "hotelCheckin":
					rtt.checkindate("01/12/2024", "04/12/2024");
				case "listing":
					rtt.HotelListing();
				case "myCart":
					rtt.myselection();
				case "firstPaxTitle":
					rtt.dropdowntitle1("Mr.");
				case "firstGuestInfo":
					rtt.paxinfo1("Deep", "Patel", "11/11/1995");
				case "secondPaxTitle":
					rtt.dropdowntitle2("Mrs.");
				case "secondGuestInfo":
					rtt.paxinfo2("Reena", "Patil", "19/08/1996");
					
					
				default:
					System.out.println("Defect");
					break;
				}
		}
	} 
	catch (Exception e) 
	{
		
	}
	}
}


//		for(int i=1;i<=sheet.getLastRowNum();i++)
//		{
//			XSSFRow row = sheet.getRow(i);
//			XSSFCell TestStep = row.getCell(0);
//			RepoTamTamB2B rtt = new RepoTamTamB2B(w);
//			switch (TestStep.toString()) 
//			{
//			case "openUrl":
//				rtt.openUrl("https://b2b.tamtamtours.com/Agentlogin.aspx");
//				break;
//			case "login":
//				rtt.login("kiran@tamtamtours.com", "Kiran@tamtam");
//				break;
//			case "clickHotel":
//				rtt.hotel();
//			case "selectDestination":
//				rtt.dropdownOnDestination("71");
//			case "hotelCheckin":
//				rtt.checkindate("01/12/2024", "04/12/2024");
//			case "listing":
//				rtt.HotelListing();
//			case "firstPaxTitle":
//				rtt.dropdowntitle1("Mr.");
//			case "firstGuestInfo":
//				rtt.paxinfo1("Deep", "Patel", "11/11/1995");
//			case "secondPaxTitle":
//				rtt.dropdowntitle2("Mrs.");
//			case "secondGuestInfo":
//				rtt.paxinfo2("Reena", "Patil", "19/08/1996");
//				
//				
//			default:
//				System.out.println("Defect");
//				break;
//			}
//		}
		
		
//		r.openUrl();
//		r.login("Kiran@tamtamtours.com", "Kiran@tamtam");
//		r.hotel();
//		
//		//r.checkin();
		
		
	