package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Flipkart_0707 
{
	static WebDriver w;
	public static void main(String[] args) throws Exception
	{
		for(int i =1;i<=2;i++)
		{
			w = new ChromeDriver();
			RepoFlipkart_0707 f = new RepoFlipkart_0707(w);
			w.manage().window().maximize();
			w.get("https://www.flipkart.com/");
			f.search("mobile");
			if(i==1)
			{
				f.productselection1();
			}
			else if (i==2) 
			{
				f.productselection2();
			}
			try {
				f.buynow();
			} catch (Exception e) {
				System.out.println("Coming Soon");
			}
			
		}
	}
}
