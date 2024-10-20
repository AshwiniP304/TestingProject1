package stepDefination;

import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FlipkartTask_1310 
{
WebDriver w;
	
	@Given("launch Chrome Browser And Navigate to https:\\/\\/www.flipkart.com\\/")
	public void launch_chrome_browser_and_navigate_to_https_www_flipkart_com() 
	{
		w = new ChromeDriver();
	    w.manage().window().maximize();
	    w.get("https://www.flipkart.com/");
	}

	@When("search the {string} in Flipkart")
	public void search_the_in_flipkart(String string)
	{
	    w.findElement(By.name("q")).sendKeys(string,Keys.ENTER);
//	    if (string.equals("shoes")) 
//	    {
//	    	 w.findElement(By.xpath("/html/body/div/div/div[3]/div[1]/div[2]/div[2]/div/div[1]/div/div/a[1]")).click();
//	    	 
//		}
//	    else if (string.equals("goPro")) 
//	    {
//			w.findElement(By.xpath("/html/body/div/div/div[3]/div[1]/div[2]/div[2]/div/div[1]/div/a[2]")).click();
//		}
//	    else if (string.equals("watch")) 
//	    {
//			w.findElement(By.xpath("/html/body/div/div/div[3]/div[1]/div[2]/div[2]/div/div[3]/div/div/a[1]")).click();
//		}
//	    else 
//	    {
//			w.findElement(By.xpath("/html/body/div/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[2]")).click();
//		}   
//	}
	
	if (string.equals("shoes")||string.equals("watch")) 
    {
   	 w.findElement(By.xpath("/html/body/div/div/div[3]/div[1]/div[2]/div[2]/div/div[1]/div/div/a[1]")).click();
   	 
	}
   else if (string.equals("goPro")) 
   {
		w.findElement(By.xpath("/html/body/div/div/div[3]/div[1]/div[2]/div[2]/div/div[1]/div/a[2]")).click();
	}
   else if (string.equals("watch")) 
   {
		w.findElement(By.xpath("/html/body/div/div/div[3]/div[1]/div[2]/div[2]/div/div[3]/div/div/a[1]")).click();
	}
   else 
   {
		w.findElement(By.xpath("/html/body/div/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[2]")).click();
	}   
}
	

	@Then("add Product to Cart")
	public void add_product_to_cart() throws Exception 
	{
		String parentwindow = w.getWindowHandle();
		Set<String> multiwindow =w.getWindowHandles();
		
		for(String child: multiwindow)
		{
			if (!parentwindow.equals(child)) 
			{
				w.switchTo().window(child);
				Thread.sleep(2000);
				w.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")).click();
			}
		} 
	}
	@Then("I verify the product {string} in step")
	public void i_verify_the_product_in_step(String string) throws Exception 
	{
		Thread.sleep(2000);
		 Assert.assertEquals(true,w.getTitle().contains(string));
	}
}
