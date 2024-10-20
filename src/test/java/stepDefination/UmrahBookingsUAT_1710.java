package stepDefination;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class UmrahBookingsUAT_1710 
{
	WebDriver w;
	@Given("Umrah Bookings UAT site Open in ChromeBrowser")
	public void umrah_bookings_uat_site_open_in_chrome_browser() throws Exception
	{
	  w = new ChromeDriver();
	  w.manage().window().maximize();
	  Thread.sleep(2000);
	  w.get("http://114.79.133.41/b2bumrahbookings/Agentlogin3.aspx");
	  w.findElement(By.id("btnAccept")).click();
	  w.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@Given("ashwinip@puratech.in value in username field.")
	public void ashwinip_puratech_in_value_in_username_field() throws Exception 
	{
		Thread.sleep(2000);
		w.findElement(By.id("txtusername")).sendKeys("ashwinip@puratech.in");
	}
	
	@Then("Enter {int} value in password fields.")
	public void enter_value_in_password_fields(Integer int1) throws Exception
	{
		Thread.sleep(2000);
		w.findElement(By.id("txtpassword")).sendKeys("715715");
	}
	
	@Then("Agent should be login to Umrah Booking UAT.")
	public void agent_should_be_login_to_umrah_booking_uat() throws Exception
	{
	    Thread.sleep(2000);
	    w.findElement(By.xpath("//*[@id=\"divLogin\"]/div[4]/a")).click();
	}

	@Then("make a hotels search")
	public void make_a_hotels_search() throws Exception
	{	
	  WebElement destination = w.findElement(By.id("HotelForm_dllCity"));
	  Select des = new Select(destination);
	  des.selectByVisibleText("Makkah, Saudi Arabia");
	  Thread.sleep(2000);
	  w.findElement(By.id("txtCheckinDate")).sendKeys("11/11/2024");
	  Thread.sleep(2000);
	  
	  //checking nights drop-down
	  WebElement nights = w.findElement(By.id("ddlNoOfDays"));
	  Select se = new Select(nights);
	  se.selectByValue("2");
	  
	  
	  //w.findElement(By.id("txtCheckOutDate")).sendKeys("13/11/2024");
	  Thread.sleep(2000);
	  w.findElement(By.id("divbtnSearch")).click();
	  Thread.sleep(2000);
	}

	@Then("select hotel for booking")
	public void select_hotel_for_booking() throws Exception
	{
	   w.findElement(By.xpath("//*[@id=\"spring_1\"]/div[1]/div/div/div/div[2]/div/a/button")).click();
	   Thread.sleep(2000);
	   String parentwindow = w.getWindowHandle();
	    Thread.sleep(2000);
		Set<String>multiwindow = w.getWindowHandles();
	
		for (String child : multiwindow)
		{
			if (!parentwindow.equals(child)) 
			{
				w.switchTo().window(child);
				Thread.sleep(2000);
				w.findElement(By.id("btnseerate")).click();
				Thread.sleep(2000);
				w.findElement(By.xpath("/html/body/form/div[3]/div/div[3]/div/div/div/div[19]/div/div/div[2]/div/div[2]/div/li/div/div[4]/div/div[2]/div[1]/button")).click();
				Thread.sleep(2000);
				w.findElement(By.xpath("/html/body/form/div[3]/div/div[1]/div/div/div[2]/div[2]/div[2]/button")).click();
				Thread.sleep(2000);
				w.findElement(By.xpath("/html/body/form/div[3]/div[5]/div/div/div/div[1]/div[1]/div[2]/a/button")).click();
				Thread.sleep(2000);
				
				WebElement title = w.findElement(By.xpath("/html/body/form/div[3]/div[5]/div/div/div/div[1]/div[2]/div[2]/div/div[2]/div[1]/div[3]/div[1]/div[1]/div/select"));
				Select se = new Select(title);
				se.selectByVisibleText("Miss.");
				Thread.sleep(2000);
				w.findElement(By.xpath("/html/body/form/div[3]/div[5]/div/div/div/div[1]/div[2]/div[2]/div/div[2]/div[1]/div[3]/div[1]/div[2]/div/input")).sendKeys("Ashwini");
				Thread.sleep(2000);
				w.findElement(By.xpath("/html/body/form/div[3]/div[5]/div/div/div/div[1]/div[2]/div[2]/div/div[2]/div[1]/div[3]/div[1]/div[3]/div/input")).sendKeys("Patil");
				Thread.sleep(2000);
				w.findElement(By.id("sr_SpecialRequest")).sendKeys("Test Booking");
				Thread.sleep(2000);
				w.findElement(By.xpath("/html/body/form/div[3]/div[5]/div/div/div/div[1]/div[2]/div[5]/div[2]/button")).click();
				Thread.sleep(2000);
			}	
		}
	}
	@Then("click on book button")
	public void click_on_book_button() throws Exception 
	{
	    List<WebElement> radiobutton = w.findElements(By.xpath("/html/body/form/div[3]/div[5]/div/div/div/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div/label/span"));
	    Thread.sleep(2000);
	    for(WebElement rb : radiobutton)
	    {
	    	rb.click();
	    	Thread.sleep(2000);
	    	
	    List<WebElement> termsndcondition = w.findElements(By.xpath("/html/body/form/div[3]/div[5]/div/div/div/div[1]/div[3]/div[1]/div[2]/label/span"));
	    Thread.sleep(2000);
	    for(WebElement radio : termsndcondition)
	    {
	    	radio.click();
	    	Thread.sleep(2000);
	    }
	    w.findElement(By.xpath("/html/body/form/div[3]/div[5]/div/div/div/div[1]/div[3]/div[2]/div[2]/button")).click();
	    Thread.sleep(2000);  	
	    }
	}
}
