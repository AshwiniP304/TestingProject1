package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_AmazonFlikart_1905
{
	public static void main(String[] args) throws Exception 
	{
		WebDriver w = new ChromeDriver();
		Thread.sleep(2000);
		w.manage().window().maximize();
		w.get("https://www.amazon.in/");
		Thread.sleep(2000);
		w.navigate().to("https://www.flipkart.com/");
		Thread.sleep(2000);
		w.navigate().back();
		Thread.sleep(2000);
		String title = w.getTitle();
		String expTitle ="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		
		if (title.equals(expTitle))
		{
			System.out.println("Title has been matched");
		} 
		else
		{
			System.out.println("Title match not found");
	}
		w.navigate().forward();
		System.out.println(w.getCurrentUrl());
}
}