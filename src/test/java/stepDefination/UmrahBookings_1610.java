package stepDefination;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UmrahBookings_1610 
{
	WebDriver w;
	@Given("Umrah Bookings site Open in ChromeBrowser")
	public void umrah_bookings_site_open_in_chrome_browser()
	{
	    w = new ChromeDriver();
	    w.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	}
	@Given("navigate to http:\\/\\/umrahbooking.com\\/")
	public void navigate_to_http_umrahbooking_com() 
	{
		w.manage().window().maximize();
		w.get("https://umrahbookings.com/AgentLogin3.aspx");
	}

	@When("Enter kunal@puratech.in value in username field.")
	public void enter_kunal_puratech_in_value_in_username_field()
	{
	   w.findElement(By.id("txtusername")).sendKeys("kunal@puratech.in"); 
	}

	@When("Enter {int} value in password field.")
	public void enter_value_in_password_field(Integer int1) 
	{
		w.findElement(By.id("txtpassword")).sendKeys("123");
	}

	@When("agebt should be login to Umrah Booking.")
	public void agebt_should_be_login_to_umrah_booking() 
	{
		w.findElement(By.xpath("//*[@id=\"divLogin\"]/div[4]/a")).click();  
	}

	@Then("make a hotel search")
	public void make_a_hotel_search() throws Exception
	{
	    WebElement destination = w.findElement(By.id("HotelForm_dllCity"));
	    Select des = new Select(destination);
	    des.selectByVisibleText("Makkah, Saudi Arabia");
	    Thread.sleep(2000);
	    w.findElement(By.id("txtCheckinDate")).sendKeys("11/11/2024");
	    w.findElement(By.id("txtCheckOutDate")).sendKeys("13/11/2024");
	    w.findElement(By.id("divbtnSearch")).click();
	}

	@Then("select hotel to book")
	public void select_hotel_to_book() throws Exception
	{
	  w.findElement(By.xpath("//*[@id=\"spring_12\"]/div[1]/a/div/div/div/div[2]/h4")).click();
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
				se.selectByVisibleText("Mr.");
				Thread.sleep(2000);
				w.findElement(By.xpath("/html/body/form/div[3]/div[5]/div/div/div/div[1]/div[2]/div[2]/div/div[2]/div[1]/div[3]/div[1]/div[2]/div/input")).sendKeys("Test");
				Thread.sleep(2000);
				w.findElement(By.xpath("/html/body/form/div[3]/div[5]/div/div/div/div[1]/div[2]/div[2]/div/div[2]/div[1]/div[3]/div[1]/div[3]/div/input")).sendKeys("Booking");
				Thread.sleep(2000);
			}
		}
	}			

	@Then("click on book")
	public void click_on_book() 
	{
	   
	}
}
