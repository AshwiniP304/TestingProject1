package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_0707
{
	static WebDriver w;
	public static void main(String[] args) throws Exception
	{
		for (int i=1;i<=2;i++)
		{
			w = new ChromeDriver();
			RepoAmazon_0707  a = new RepoAmazon_0707(w);
			w.manage().window().maximize();
			w.get("https://www.amazon.in/");
			a.search("watches for women");
			if (i==1)
			{
				a.productselection1();
			}
			else if (i==2)
			{
				a.productselection2();
			}
			a.buynow();
		}
	}
}
