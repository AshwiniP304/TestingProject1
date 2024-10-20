package stepDefination;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SauceDemoLogin
{
	WebDriver w;
	
	@Given("SauceDemo site Open in ChromeBrowser")
	public void sauce_demo_site_open_in_chrome_browser() 
	{
	    w = new ChromeDriver();
	    w.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    w.get("https://www.saucedemo.com/");
	}

	@When("Enter standard_user value in username field.")
	public void enter_standard_user_value_in_username_field()
	{
	    w.findElement(By.id("user-name")).sendKeys("standard_user");
	}

	@When("Enter secret_sauce value in password field.")
	public void enter_secret_sauce_value_in_password_field()
	{
	    w.findElement(By.id("password")).sendKeys("secret_sauce");
	}

	@When("user should be login to sauceDemo.")
	public void user_should_be_login_to_sauce_demo()
	{
	   w.findElement(By.id("login-button")).click();
	}

	@Then("user should be logout.")
	public void user_should_be_logout() 
	{
	    w.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();
	    w.findElement(By.linkText("Logout")).click();
	}

	@Then("check whether after logout Login Page displaying or not")
	public void check_whether_after_logout_login_page_displaying_or_not()
	{
	   String login = w.findElement(By.id("login-button")).getAttribute("value");
	   Assert.assertEquals("Login", login); 
	   
	   }
}
