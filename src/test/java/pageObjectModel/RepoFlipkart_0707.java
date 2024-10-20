package pageObjectModel;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RepoFlipkart_0707    //Without Page Factory
{
	WebDriver webdriver;
	WebDriver w;
		RepoFlipkart_0707(WebDriver wd)   //Constructor
		{
			w = wd;
		}
	//home page search
		By searchelement = By.name("q");
		By product1 = By.xpath("/html/body/div/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[3]/div[1]/div[1]");
		By product2 = By.xpath("/html/body/div/div/div[3]/div[1]/div[2]/div[3]/div/div/div/a/div[2]/div[1]/div[1]");
		
	//Buy Now
		By buynowbtn = By.cssSelector("button[class=\"QqFHMw vslbG+ _3Yl67G _7Pd1Fp\"]");
		
		public void search(String search) throws Exception
		{
			w.findElement(searchelement).sendKeys(search);
			Thread.sleep(2000);
			w.findElement(searchelement).submit();
		}
		public void productselection1() throws Exception
		{
			Thread.sleep(2000);
			w.findElement(product1).click();
		}
		public void productselection2() throws Exception
		{
			Thread.sleep(2000);
			w.findElement(product2).click();
		}
		public void buynow() throws Exception
		{
			Thread.sleep(2000);
			String parent = w.getWindowHandle();
			Set<String> child = w.getWindowHandles();
			for (String ch : child)
			{
				if (!ch.equals(parent))
				{
					w.switchTo().window(ch);
					Thread.sleep(2000);
					w.findElement(buynowbtn).click();
					Thread.sleep(2000);
					w.close();
				}
			}
		}			
}
