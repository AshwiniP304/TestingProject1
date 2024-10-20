package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod_1905
{
	public static void main(String[] args) throws Exception
	{
		WebDriver w = new ChromeDriver();
		Thread.sleep(2000);
		w.manage().window().maximize();
		w.get("https://www.amazon.in/");
		Thread.sleep(2000);
		w.navigate().to("https://www.amazon.in/minitv?ref_=nav_avod_desktop_topnav");
		Thread.sleep(2000);
		
		w.navigate().back();
		Thread.sleep(2000);
		
		w.navigate().forward();
		Thread.sleep(2000);
		
		w.navigate().refresh();
		Thread.sleep(2000);
		
		w.manage().window().minimize();
		Thread.sleep(2000);
		
		w.close();
		Thread.sleep(2000);
		
	}

}
